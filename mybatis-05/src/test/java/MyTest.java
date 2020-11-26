import com.yzp.entity.Student;
import com.yzp.entity.Teacher;
import com.yzp.mapper.StudentMapper;
import com.yzp.mapper.TeacherMapper;
import com.yzp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        mapper.getTeacher(1);
        sqlSession.close();
    }
@Test
    public void getStudentTest(){
    SqlSession sqlSession = MybatisUtils.getSqlSession();
    StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
    List<Student> studentList = mapper.getStudent2();
    for (Student stu:studentList) {
        System.out.println(stu);
    }
    sqlSession.close();
}

}
