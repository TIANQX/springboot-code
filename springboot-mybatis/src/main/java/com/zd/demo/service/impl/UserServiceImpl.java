package com.zd.demo.service.impl;

import com.zd.demo.dao.entity.User;
import com.zd.demo.dao.mapper.UserMapper;
import com.zd.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;


/**
 * @Author tqx
 * @CreateDate 2021/5/27
 * @Description TODO
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUsers() {
        return userMapper.queryAllUsers();
    }

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public int insertByMap(Map<String, Object> map) {
        return userMapper.insertByMap(map);
    }

    @Override
    public int insertByObject(User user) {
        return userMapper.insertByObject(user);
    }

    @Override
    public int updateUserByName(String name, Integer age) {
        return userMapper.updateUserByName(name, age);
    }

    @Override
    public int updateByObject(User user) {
        return userMapper.updateByObject(user);
    }

    @Override
    public int deleteByName(String name) {
        return userMapper.deleteByName(name);
    }
}
