package com.yzp.mapper;

import com.yzp.entity.User;
import com.yzp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {
    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一： 执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);


        System.out.println(user);


        //关闭SqlSession
        sqlSession.close();
    }
    //增删改查需提交事务
    @Test
    public void test1(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一： 执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser(new User(4, "穆棱", "12e"));
        System.out.println(i);
        sqlSession.commit();//提交事务
        //关闭SqlSession
        sqlSession.close();
    }
   @Test
    public void updateTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"妮妮","123345"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }

}
