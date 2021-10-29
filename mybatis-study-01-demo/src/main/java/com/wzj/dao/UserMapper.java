package com.wzj.dao;

import com.wzj.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUser();

    User getUserById(int id);

    User getUserByNP(@Param("name") String name, @Param("pwd") String pwd);

    User getUserByNP2(Map<String, Object> map);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    @Select("select * from user")
    List<User> getAllUser();
}
