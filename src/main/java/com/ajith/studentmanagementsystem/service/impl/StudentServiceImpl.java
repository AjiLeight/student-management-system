package com.ajith.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajith.studentmanagementsystem.entity.Student;
import com.ajith.studentmanagementsystem.repository.StudentRepository;
import com.ajith.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
 
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();     
    }
    
}
