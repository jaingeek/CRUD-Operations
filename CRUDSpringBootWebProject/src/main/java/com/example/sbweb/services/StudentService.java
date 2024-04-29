package com.example.sbweb.services;

import java.util.List;

import com.example.sbweb.entity.Student;

public interface StudentService {

	public String addStudent(Student s);
	public List<Student> readStudent();
	public String deleteStudent(String roll);
}
