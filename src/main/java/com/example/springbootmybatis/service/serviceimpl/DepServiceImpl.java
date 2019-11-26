package com.example.springbootmybatis.service.serviceimpl;

import com.example.springbootmybatis.javebean.Department;
import com.example.springbootmybatis.mapper.DepMapper;
import com.example.springbootmybatis.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepServiceImpl implements DepService {

    @Autowired
    DepMapper depMapper;

    @Override
    public Department getDep(Integer id) {
        return depMapper.getDep(id);
    }

    @Override
    public int insertDep(Department department) {
        int i = depMapper.insertDep(department);
        return i;
    }
}
