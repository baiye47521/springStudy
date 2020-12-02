package com.hand.demo02;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 19:39
 * @Description
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {

    }

    public void delete() {

    }

    public void update() {

    }

    public void query() {

    }
}
