package com.yzp.dao;

import com.yzp.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryUserById(@Param("id") int id);
    int updateUser(User user);
}
