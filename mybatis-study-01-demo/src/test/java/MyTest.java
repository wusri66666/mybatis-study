import com.wzj.dao.UserMapper;
import com.wzj.pojo.User;
import com.wzj.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void getUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUser();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void getUserById() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(3);
        System.out.println(user);
        session.close();
    }

    @Test
    public void getUserByNP() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserByNP("张三", "abcdef");
        System.out.println(user);
        session.close();
    }

    @Test
    public void getUserByNP2() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "狂神");
        map.put("pwd", "123456");
        User user = mapper.getUserByNP2(map);
        System.out.println(user);
        session.close();
    }

    @Test
    public void addUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(4, "wzj", "wzj");
        int i = mapper.addUser(user);
        System.out.println(i);
        session.commit();
        session.close();
    }

    @Test
    public void updateUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        user.setName("jack");
        int i = mapper.updateUser(user);
        session.commit();
        System.out.println(i);
        session.close();
    }

    @Test
    public void deleteUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        System.out.println(i);
        session.commit();
        session.close();
    }

    @Test
    public void getAllUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        for (User user : mapper.getAllUser()) {
            System.out.println(user);
        }
        session.close();
    }

}
