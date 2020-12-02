package com.hand.demo01;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 18:19
 * @Description
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        bill();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void bill(){
        System.out.println("签租赁合同");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
