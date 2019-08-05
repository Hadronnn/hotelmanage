package com.hadron.hotelmanage.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author Hadron
 * @date 2019/8/3 23:23
 */
@Component
@Aspect
public class AllAspect {
    private Logger logger = LoggerFactory.getLogger(AllAspect.class);
    @Pointcut("execution(public * com.hadron.hotelmanage.controller.HelloController.*(..))")
    public void log(){}
    //AOP的前置通知
    @Before("log()")
    //JoinPoint:连接点,可以获取目标方法的信息
    public void before(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        //获取请求地址
        StringBuffer requestURL = request.getRequestURL();
        logger.debug("request url : {}",requestURL);
        //获取请求方式
        String method = request.getMethod();
        logger.debug("request : method {}",method);
        //获取目标方法的方法名
        String name = joinPoint.getSignature().getName();
        logger.debug("method name : {}",name);
        //获取目标方法的参数
        Object[] args = joinPoint.getArgs();
        logger.debug("method args : {}", Arrays.toString(args));
    }
    //返回通知，在目标方法返回结果之后执行
    @AfterReturning(pointcut = "log()",returning = "object")
    public void afterReturning(Object object){
        logger.debug("returnIng : {}",object);
    }
    @After("log()")
    public void after(JoinPoint joinPoint){
        String method = joinPoint.getSignature().getName();
        logger.debug("method {} end",method);
    }
    @AfterThrowing(pointcut = "log()",throwing = "e")
    public void afterThrowing(Exception e){
        logger.error("exception : {}",e.toString());
    }
}
