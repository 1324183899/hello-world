package com.example.demo.controller;

import com.example.demo.entity.UserPersonal;
import com.example.demo.service.UserServicePersonal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testBootPersonal")
public class UserControllerPersonal {
    @Autowired
    private UserServicePersonal userServicePersonal;
    //通过用户id获取用户所有信息
    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    //  http://localhost:80/testBootPersonal/getUser?id=1(此处1为要获取的id）
    //@RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String GetUser(@PathVariable int id) {
        return userServicePersonal.getUserInfo(id).toString();
    }
    //通过用户id删除用户
    //    http://localhost:80/testBootPersonal/delete?id=1(此处1为要删除的id）
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userServicePersonal.deleteById(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //根据用户id更新用户信息
    // http://localhost:80/testBootPersonal/update参数
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(UserPersonal userPersonal) {
        int result = userServicePersonal.Update(userPersonal);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //插入新用户
    // http://localhost:80/testBootPersonal/insert参数
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public UserPersonal insert(UserPersonal userPersonal) {
        return userServicePersonal.save(userPersonal);
    }
    //打印所有用户信息
    //    http://localhost:80/testBootPersonal/selectAll
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<UserPersonal> ListUser() {
        return userServicePersonal.selectAll();
    }
}
