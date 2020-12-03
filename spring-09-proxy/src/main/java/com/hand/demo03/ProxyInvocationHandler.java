package com.hand.demo03;

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
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),this);
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

        //动态代理的本质就是反射机制
        seeHouse();
        Object res = method.invoke(rent, args);
        fare();
        return res;
    }

    public void seeHouse(){
        System.out.println("中间带看房子");
    }

    public void fare(){
        System.out.println("中间收中介费");
    }
}
