package com.ajith.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ajith.studentmanagementsystem.service.StudentService;

@Controller
public class StudentController {
    
    private StudentService studentService;

    public StudentController(StudentService studetService) {
        this.studentService = studetService;
    }

    @GetMapping("/students")
    public String listStudent( Model model){
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }
}
