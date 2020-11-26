import com.yzp.entity.Teacher;
import com.yzp.mapper.TeacherMapper;
import com.yzp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getTeacherTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeacher2(1);
        for (Teacher teacher:teacherList) {
            System.out.println(teacher);
        }
        sqlSession.close();


    }
}
