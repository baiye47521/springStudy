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
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
