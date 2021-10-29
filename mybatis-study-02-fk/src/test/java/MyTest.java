import com.wzj.dao.StudentMapper;
import com.wzj.dao.TeacherMapper;
import com.wzj.pojo.Student;
import com.wzj.pojo.Teacher;
import com.wzj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession session = MybatisUtils.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        session.close();
    }

    @Test
    public void testStudent(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void testStudent2(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents2();
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }
}
