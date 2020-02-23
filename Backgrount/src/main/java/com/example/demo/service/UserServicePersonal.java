package com.example.demo.service;

import com.example.demo.entity.UserPersonal;
import com.example.demo.dao.UserMapperPersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicePersonal {
    @Autowired
    UserMapperPersonal userMapperPersonal;
    public UserPersonal getUserInfo(int id){
        return userMapperPersonal.getUserInfo(id);
    }
    public UserPersonal save(UserPersonal userPersonal) {
        userMapperPersonal.save(userPersonal);
        return userPersonal;
    }
    public List<UserPersonal> selectAll(){
        return	userMapperPersonal.selectAll();
    }
    public int Update(UserPersonal userPersonal){
        return userMapperPersonal.update(userPersonal);
    }
    public int deleteById(int id){
        return userMapperPersonal.deleteById(id);
    }
}
