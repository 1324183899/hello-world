package com.example.demo.service;

import com.example.demo.entity.UserPosition;
import com.example.demo.dao.UserMapperPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicePosition {
    @Autowired
    UserMapperPosition userMapperPosition;
    public UserPosition getUserInfo(int id){
        return userMapperPosition.getUserInfo(id);
    }
    public UserPosition save(UserPosition userPosition) {
        userMapperPosition.save(userPosition);
        return userPosition;
    }
    public List<UserPosition> selectAll(){
        return	userMapperPosition.selectAll();
    }
    public int Update(UserPosition userPosition){
        return userMapperPosition.update(userPosition);
    }
    public int deleteById(int id){
        return userMapperPosition.deleteById(id);
    }
}
