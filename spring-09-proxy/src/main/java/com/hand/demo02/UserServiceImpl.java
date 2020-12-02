package com.hand.demo02;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 18:51
 * @Description
 */
public class UserServiceImpl implements UserService{

    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
