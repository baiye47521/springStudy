package com.hand.pojo;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/1 18:26
 * @Description
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
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
