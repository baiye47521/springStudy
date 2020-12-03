package com.hand.Log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/3 14:57
 * @Description
 */
public class AfterLog implements AfterReturningAdvice {


    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回结果为："+returnValue);
    }
}
