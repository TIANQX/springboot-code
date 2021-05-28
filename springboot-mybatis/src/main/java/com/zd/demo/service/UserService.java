package com.zd.demo.service;

import com.zd.demo.dao.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author tqx
 * @CreateDate 2021/5/27
 * @Description TODO
 */
public interface UserService {
    List<User> queryAllUsers();

    public List<User> getUserByName(String name);

    int insertByMap(Map<String,Object> map);

    int insertByObject(User user);

    int updateUserByName(String name,Integer age);

    int updateByObject(User user);

    int deleteByName(String name);
}
