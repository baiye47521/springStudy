package com.hand.service;

import com.hand.dao.UserDao;
import com.hand.dao.UserDaoImpl;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/1 17:04
 * @Description
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
