package com.himanshu.service;

import com.himanshu.entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    Student getStudentByid(int id);

    List<Student> getAllStudent();

    Student findStudentByMob(String mob);

    Student updateStudent(int id,Student student);

    void deletStudent(int id);


}
