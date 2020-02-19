package com.atguigu.springboot.controller;

import com.atguigu.springboot.Entity.Department;
import com.atguigu.springboot.Entity.Employee;
import com.atguigu.springboot.mapper.DepartmentMapper;
import com.atguigu.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

/**
 * 时间：  2020/2/19
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
@RestController
public class DepartController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepart(@PathVariable("id") Integer id){

        Department dept = departmentMapper.getDepts(id);
        System.out.println(dept);
        return dept;
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){

        departmentMapper.insert(department);
        return department;


    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }
}
