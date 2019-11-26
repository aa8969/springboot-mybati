package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.javebean.Department;
import com.example.springbootmybatis.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {

    @Autowired
    DepService depService;

    @GetMapping("/getDep/{id}")
    public Department getDep(@PathVariable("id") Integer id){

        return depService.getDep(id);
    }

    @GetMapping("/insertDep")
    public Department insertDep(Department department){

        depService.insertDep(department);
        return department;
    }

}
