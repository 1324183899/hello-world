package com.example.demo.service;

import com.example.demo.entity.UserLogin;
import com.example.demo.dao.UserMapperLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceLogin{
    @Autowired
    UserMapperLogin userMapperLogin;

    public UserLogin getUserInfo(int id){
        return userMapperLogin.getUserInfo(id);
    }
    public UserLogin save(UserLogin userLogin) {
        userMapperLogin.save(userLogin);
        return userLogin;
    }
    public List<UserLogin> selectAll(){
        return	userMapperLogin.selectAll();
    }
    public int Update(UserLogin userLogin){
        return userMapperLogin.update(userLogin);
    }
    public int deleteById(int id){
        return userMapperLogin.deleteById(id);
    }
}
