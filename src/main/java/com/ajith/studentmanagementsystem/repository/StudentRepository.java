package com.ajith.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajith.studentmanagementsystem.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
