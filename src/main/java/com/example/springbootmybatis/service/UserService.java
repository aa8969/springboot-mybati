package com.example.springbootmybatis.service;

import com.example.springbootmybatis.javebean.User;

public interface UserService {


    public User getUser(Integer id);

    public int insertUser(User user);

    public int delUser(Integer id);
}
