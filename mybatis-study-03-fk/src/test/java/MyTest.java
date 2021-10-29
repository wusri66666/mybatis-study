import com.wzj.dao.TeacherMapper;
import com.wzj.pojo.Teacher;
import com.wzj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class MyTest {
    @Test
    public void getTeacher(){
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher.getName());
        System.out.println(teacher.getStudents());
        session.close();
    }

    @Test
    public void getTeacher2(){
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2.getName());
        System.out.println(teacher2.getStudents());
        session.close();
    }
}
