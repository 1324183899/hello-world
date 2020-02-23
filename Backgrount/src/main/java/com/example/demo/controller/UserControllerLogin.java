package com.example.demo.controller;

import com.example.demo.entity.UserLogin;
import com.example.demo.service.UserServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testBootLogin")
public class UserControllerLogin {
    @Autowired
    private UserServiceLogin userServiceLogin;
    //通过用户id获取用户所有信息
    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    //  http://localhost:80/testBootLogin/getUser?id=1(此处1为要获取的id）
    public String GetUser(@PathVariable int id) {
        return userServiceLogin.getUserInfo(id).toString();
    }
    //通过用户id删除用户
    //    http://localhost:80/testBootLogin/delete?id=1(此处1为要删除的id）
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userServiceLogin.deleteById(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //根据用户id更新用户信息
    // http://localhost:80/testBootLogin/update参数
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(UserLogin userLogin) {
        int result = userServiceLogin.Update(userLogin);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //插入新用户
    // http://localhost:80/testBootLogin/insert参数
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public UserLogin insert(UserLogin userLogin) {
        return userServiceLogin.save(userLogin);
    }
    //打印所有用户信息
    //    http://localhost:80/testBootLogin/selectAll
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<UserLogin> ListUserLogin() {
        return userServiceLogin.selectAll();
    }
}
