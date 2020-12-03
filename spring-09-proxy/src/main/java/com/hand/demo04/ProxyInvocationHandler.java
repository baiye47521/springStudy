package com.hand.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/3 14:11
 * @Description 自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
    /*
     * @Description: 处理代理实例，返回结果
     * @Author: ludongpeng
     * @Date: 2020/12/3 14:12
     * @param proxy
     * @param method
     * @param args
     {@link java.lang.Object}
     **/

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());

        //动态代理的本质就是反射机制
        Object res = method.invoke(target, args);
        return res;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

}
