package com.example.demo.dao;

import com.example.demo.entity.UserLogin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapperLogin {
    /**  根据id查询用户信息
     */
    UserLogin getUserInfo(int id);
    /** 新增用户
     */
    int save (UserLogin user);
    /**更新用户信息
     */
    int update (UserLogin user);
    /**根据id删除
     */
    int deleteById (int id);
    /** 查询所有用户信息
     */
    List<UserLogin> selectAll ();
}
