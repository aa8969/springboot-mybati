package com.example.springbootmybatis.service.serviceimpl;

import com.example.springbootmybatis.javebean.User;
import com.example.springbootmybatis.mapper.UserMapper;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser(Integer id) {

        return userMapper.selectUser(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int delUser(Integer id) {
        return userMapper.delUser(id);
    }
}
