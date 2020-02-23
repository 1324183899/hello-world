package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;
    //通过用户id获取用户所有信息
    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    //  http://localhost:80/testBoot/getUser?id=1(此处1为要获取的id）
    public String GetUser(@PathVariable int id) {
        return userService.getUserInfo(id).toString();
    }
    //通过用户id删除用户
    //http://localhost:80/testBoot/delete?id=1(此处1为要删除的id）
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userService.deleteById(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    //根据用户id更新用户信息
    // http://localhost:80/testBoot/update?参数
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        int result = userService.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }
    //插入新用户
    // http://localhost:80/testBoot/insert?参数
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user) {
        return userService.save(user);
    }
    //打印所有用户信息
    //3http://localhost:80/testBoot/selectAll
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<User> ListUser() {
        return userService.selectAll();
    }
}
