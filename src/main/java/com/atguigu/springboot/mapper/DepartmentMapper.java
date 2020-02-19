package com.atguigu.springboot.mapper;

import com.atguigu.springboot.Entity.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import sun.net.idn.Punycode;

/**
 * 时间：  2020/2/19
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
//@Mapper
public interface DepartmentMapper {

    @Select("select  * from department where id = #{id}")
     Department getDepts(Integer id);

    @Delete("delete from department where id = #{id}")
      int deleteDepartments(Integer id);

    //设置返回主键，指定主键为id
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName)values (#{departmentName})")
     int insert(Department department);

    @Update("update department set departmentName=#{departmentName} where id = #{id}")
     int updateDepart(Department department);
}
