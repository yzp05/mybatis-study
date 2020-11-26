package com.yzp.mapper;

import com.yzp.entity.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //根据id查询
    User getUserById(int id);
    //插入一个用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
}
