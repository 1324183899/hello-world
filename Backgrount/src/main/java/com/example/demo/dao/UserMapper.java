package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /** 根据id查询用户信息
     */
    User getUserInfo(int id);
    /** 新增用户
     */
    int save (User user);
    /**更新用户信息
     */
    int update (User user);
    /** 根据id删除
     */
    int deleteById (int id);
    /**查询所有用户信息
     */
    List<User> selectAll ();
}
