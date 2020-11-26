package com.yzp.dao;

import com.yzp.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询所有用户
    List<User> getUserList();
    //根据id查询
    User getUserById(int id);
    //插入一个用户
    int addUser(User user);
    int addUser1(Map map);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
    //模糊查询
    List<User> getUserLike(String value);
}
