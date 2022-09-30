package com.ajith.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ajith.studentmanagementsystem.entity.Student;
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
    
    @GetMapping("/students/new")
    public String createStudentForm(Model model){

        // create student object to hold form data
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {

        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

        //getStudentById from database

        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        //save updated student information

        studentService.updateStudent(existingStudent);
        
        return("redirect:/students");
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return("redirect:/students");
    }
}
