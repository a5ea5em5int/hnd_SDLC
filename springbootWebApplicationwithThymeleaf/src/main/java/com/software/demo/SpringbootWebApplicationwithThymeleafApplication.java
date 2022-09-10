package com.software.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.software.demo.entity.Student;
import com.software.demo.repository.StudentRepository;

@SpringBootApplication
public class SpringbootWebApplicationwithThymeleafApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplicationwithThymeleafApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String...  args) throws Exception{
		
		Student student1 = new Student("Ramesh","Fadata","rama@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student("Myint","ayeaye","ayeaye@gmail.com");
		studentRepository.save(student2);
		Student student3 = new Student("Nwe","Sinthia","sinthia@gmail.com");
		studentRepository.save(student3);
		
	}

}
