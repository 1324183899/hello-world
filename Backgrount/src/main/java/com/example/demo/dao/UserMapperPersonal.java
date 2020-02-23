package com.example.demo.dao;

import com.example.demo.entity.UserPersonal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapperPersonal {
    /** 根据id查询用户信息
     */
    UserPersonal getUserInfo(int id);
    /**新增用户
      */
    int save (UserPersonal userPersonal);
    /**更新用户信息
     */
    int update (UserPersonal userPersonal);
    /** 根据id删除
     */
    int deleteById (int id);
    /**查询所有用户信息
     */
    List<UserPersonal> selectAll ();
}
