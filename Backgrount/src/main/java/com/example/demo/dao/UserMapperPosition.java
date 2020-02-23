package com.example.demo.dao;

import com.example.demo.entity.UserPosition;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapperPosition {
    /**  根据id查询用户信息
     * */
    UserPosition getUserInfo(int id);
    /** 新增用户
     */
    int save (UserPosition userPosition);
    /**更新用户信息
     */
    int update (UserPosition userPosition);
    /**根据id删除
     */
    int deleteById (int id);
    /**查询所有用户信息
     */
    List<UserPosition> selectAll ();
}
