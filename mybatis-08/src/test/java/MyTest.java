import com.yzp.dao.UserMapper;
import com.yzp.entity.User;
import com.yzp.utils.MybatisUtils;
import lombok.Data;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();
        System.out.println("==================");


        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);

        System.out.println(user==user2);

        sqlSession2.close();
    }

}
