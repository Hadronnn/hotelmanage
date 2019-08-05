package com.hadron.hotelmanage.controller;

import com.hadron.hotelmanage.exception.LoginException;
import com.hadron.hotelmanage.util.Result;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler
    @ResponseBody
    public Result exception(Exception e){
        if (e instanceof LoginException){
            LoginException loginException = (LoginException) e;
            int code = loginException.getCode();
            String message = loginException.getMessage();
            return new Result(code,message);
        }
        String message = e.getMessage();
        if (StringUtils.isEmpty(message)){
            message = "未知错误";
        }
        return new Result(-1,message);
    }
}
