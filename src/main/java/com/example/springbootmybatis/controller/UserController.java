package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.javebean.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userService.getUser(id);
        return user;
    }

    @GetMapping("/insertUser")
    public User insertUser(User user){
        userService.insertUser(user);
        return user;
    }
}
