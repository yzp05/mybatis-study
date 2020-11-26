package com.yzp.log;

import com.yzp.entity.User;
import com.yzp.mapper.UserMapper;
import com.yzp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class LogTest {
    static Logger logger = Logger.getLogger(LogTest.class);
    @Test
    public void Log4jTest(){
        logger.info("info:进入到了Log4jTest方法");
        logger.debug("debug:进入到了Log4jTest方法");
        logger.error("error:进入到了Log4jTest方法");

    }
    @Test
    public void test(){
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        logger.info("测试,进入test方法");
        //方式一： 执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
        //关闭SqlSession
        sqlSession.close();
    }
}
