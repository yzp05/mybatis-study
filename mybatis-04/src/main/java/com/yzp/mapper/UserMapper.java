package com.yzp.mapper;

import com.yzp.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
   List<User> getUsers();


//    有多个参数时必须加上@Param
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd)values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{yid}")
    int deleteUser(@Param("yid") int id);
}
