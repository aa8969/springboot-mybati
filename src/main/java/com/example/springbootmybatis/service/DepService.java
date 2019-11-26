package com.example.springbootmybatis.service;

import com.example.springbootmybatis.javebean.Department;

public interface DepService {

    public Department getDep(Integer id);

    public int insertDep(Department department);

}
