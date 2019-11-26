package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.javebean.User;

public interface UserMapper {

    public User selectUser(Integer id);

    public int insertUser(User user);

    public int delUser(Integer id);
}
