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

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
        
    }
    
}
