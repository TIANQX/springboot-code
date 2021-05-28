package com.zd.demo.controller;

import com.zd.demo.dao.entity.User;
import com.zd.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author tqx
 * @CreateDate 2021/5/27
 * @Description TODO
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryAllUsers")
    public List<User> queryAllUsers() {
        return userService.queryAllUsers();
    }


    @GetMapping("/getUserByName")
    public List<User> getUserByName(String name) {
        return userService.getUserByName(name);
    }

    @PostMapping("/insertByMap")
    public int insertByMap(String name, Integer age) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        return userService.insertByMap(map);
    }

    @GetMapping("/insertByObject")
    public int insertByObject(String name, Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return userService.insertByObject(user);
    }

    @GetMapping("/updateUserByName")
    public int updateUserByName(String name, Integer age) {
        return userService.updateUserByName(name,age);
    }
    @GetMapping("/updateByObject")
    public int updateByObject(String name, Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return userService.updateByObject(user);
    }


    @GetMapping("/deleteByName")
    public int deleteByName(String name) {
        return userService.deleteByName(name);
    }

}
