package com.yzp.mapper;

import com.yzp.entity.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生信息，以及对应的老师信息
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
