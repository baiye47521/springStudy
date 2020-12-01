package com.hand.pojo;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/1 18:45
 * @Description
 */
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+name);
    }
}
