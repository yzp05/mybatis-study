package com.yzp.dao;

import com.yzp.pojo.User;
import com.yzp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一： 执行SQL
        UserDao mapper = sqlSession.getMapper(UserDao.class);
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
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.addUser(new User(4, "穆棱", "12e"));
        System.out.println(i);
        sqlSession.commit();//提交事务
        //关闭SqlSession
        sqlSession.close();
    }
   @Test
    public void updateTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.updateUser(new User(4,"妮妮","123345"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.deleteUser(4);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void update1Test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId",4);
        map.put("pwd",33333);
        mapper.addUser1(map);
        sqlSession.commit();
        sqlSession.close();
    }
@Test
    public void getUserLikeTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.getUserLike("米");
        for (User user:users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
