package com.hand.demo01;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 18:18
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
