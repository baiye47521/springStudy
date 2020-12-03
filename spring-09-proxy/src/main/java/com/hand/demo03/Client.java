package com.hand.demo03;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/3 14:22
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色处理要调用的接口对象
        pih.setRent(host);

        //动态生成的proxy
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
