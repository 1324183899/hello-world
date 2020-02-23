package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public User getUserInfo(int id){
        return userMapper.getUserInfo(id);
    }
    public User save(User user) {
        userMapper.save(user);
        return user;
    }
    public List<User> selectAll(){
        return	userMapper.selectAll();
    }
    public int Update(User user){
        return userMapper.update(user);
    }
    public int deleteById(int id){
        return userMapper.deleteById(id);
    }
}