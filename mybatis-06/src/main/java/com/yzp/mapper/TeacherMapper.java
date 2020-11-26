package com.yzp.mapper;

import com.yzp.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    //List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息
    List<Teacher> getTeacher(@Param("tid") int id);

    List<Teacher> getTeacher2(@Param("tid") int id);
}
