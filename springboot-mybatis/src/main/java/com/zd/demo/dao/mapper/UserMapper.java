package com.zd.demo.dao.mapper;

import com.zd.demo.dao.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author tqx
 * @CreateDate 2021/5/27
 * @Description TODO
 */
@Repository
public interface UserMapper {
    @Select("select name,sex,age,classNo from user")
    @Results({
            @Result(property = "name", column = "name", jdbcType = JdbcType.VARCHAR),
            @Result(property = "sex", column = "sex")
    })
    List<User> queryAllUsers();

    @Select("select name,sex,age,classNo from user where name=#{name}")
    @Results({
            @Result(property = "name", column = "name", jdbcType = JdbcType.VARCHAR),
            @Result(property = "sex", column = "sex")
    })
    List<User> getUserByName(String name);


    //方法一：以Map的方式插入(注意values中的写法，要指定数据类型)
    @Insert("insert into user(name,age) values (#{name,jdbcType=VARCHAR},#{age,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    //方法二：以对象的方式插入
    @Insert("insert into user(name,age) values (#{name,jdbcType=VARCHAR},#{age,jdbcType=INTEGER})")
    int insertByObject(User user);


    @Update("update user set age = #{age} where name = #{name}")
    int updateUserByName(@Param("name") String name, @Param("age") Integer age);

    //根据一个对象去更新
    @Update("update user set age = #{age} where name = #{name}")
    int updateByObject(User user);

    @Delete("delete from user where name = #{name}")
    int deleteByName(String name);


}

