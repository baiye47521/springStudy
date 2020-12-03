package com.hand.demo04;

import com.hand.demo02.UserService;
import com.hand.demo02.UserServiceImpl;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/3 14:32
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        /*
         * @Description:设置要生成的对象
         * @Author: ludongpeng
         * @Date: 2020/12/3 14:40
          * @param args
         **/
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService)pih.getProxy();
        proxy.delete();
    }
}
