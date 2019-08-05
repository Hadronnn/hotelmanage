package com.hadron.hotelmanage.exception;

import com.hadron.hotelmanage.util.ExceptionCode;

/**
 * @Author Hadron
 * @date 2019/8/5 15:48
 */
public class LoginException extends RuntimeException {

    private int code;
    public LoginException(int code,String msg){
        super(msg);
        this.code = code;
    }
    public LoginException(ExceptionCode exceptionCode){
        super(exceptionCode.getMsg());
        this.code = exceptionCode.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
