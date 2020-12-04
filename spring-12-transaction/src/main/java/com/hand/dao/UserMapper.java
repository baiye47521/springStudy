package com.hand.dao;

import com.hand.pojo.User;

import java.util.List;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/3 16:13
 * @Description
 */
public interface UserMapper {
    public List<User> selectUser();

    //添加一个用户
    public int addUser(User user);
    //删除
    public int deleteUser(int id);
}
