package com.example.springbootmybatis.javebean;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Department {

    private Integer id;

    private String departmentName;

    public Department(Integer id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public Department() {

    }
}
