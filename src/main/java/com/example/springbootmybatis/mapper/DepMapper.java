package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.javebean.Department;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface DepMapper {

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into emp_department(department_name) values(#{departmentName})")
    public int insertDep(Department department);

    @Delete("delete from emp_department where id=#{id}")
    public int delDep(Integer id);

    @Update("update emp_department set department_name=#{departmentName} where id=#{id}")
    public int updateDep(Department department);

    @Select("select * from emp_department where id=#{id}")
    public Department getDep(Integer id);

}
