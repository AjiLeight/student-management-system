package com.ajith.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ajith.studentmanagementsystem.entity.Student;
import com.ajith.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	StudentRepository studentRepository;

	@Autowired
	public StudentManagementSystemApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// Student student1 = new Student("Ameen","AR","al.r@gmail.com");
		// studentRepository.save(student1);

		// Student student2 = new Student("Ajith","A M","ajithacharath@gmail.com");
		// studentRepository.save(student2);

		// Student student3 = new Student("Aparna","Raj","aparnaraj443@gmail.com");
		// studentRepository.save(student3);

		// Student student4 = new Student("Sree","Rag","sreemyran@gmail.com");
		// studentRepository.save(student4);

	}

}
