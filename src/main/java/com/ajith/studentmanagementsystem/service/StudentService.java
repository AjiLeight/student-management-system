package com.ajith.studentmanagementsystem.service;

import java.util.List;


import com.ajith.studentmanagementsystem.entity.Student;

public interface StudentService {
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}
