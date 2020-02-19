package com.atguigu.springboot.mapper;

import com.atguigu.springboot.Entity.Employee;

/**
 * 时间：  2020/2/19
 * 创建者：  Administrator 钟文
 * 描述：  @mapper注解省略，因为已经加了mapperscaner
 * 参数：
 * 返回值：
 **/
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);


}
