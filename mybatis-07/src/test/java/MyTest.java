import com.yzp.dao.BlogMapper;
import com.yzp.entity.Blog;
import com.yzp.utils.IDutil;
import com.yzp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog(IDutil.getId(), "javaWEB", "yzp", new Date(), 600);
        mapper.insertBlog(blog);
        sqlSession.close();
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(3);
        ids.add(4);
        map.put("ids",ids);
        mapper.queryBlogForeach(map);
        sqlSession.close();
    }
}
