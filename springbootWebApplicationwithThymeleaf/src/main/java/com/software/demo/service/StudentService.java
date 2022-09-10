package com.software.demo.service;

import java.util.List;

import com.software.demo.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudent(Long id);
}
