package com.example.sbweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sbweb.entity.Student;
import com.example.sbweb.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studserv;
	
	public StudentController(StudentService studserv) {
		super();
		this.studserv = studserv;
	}
	
	@GetMapping("/map-add")
	public String addStudent() {
		return "createstudent";
	}
	
	@GetMapping("/map-delete")
	public String deleteStud() {
		return "delete";
	}
	
	@PostMapping("/create")
	public String createStudent(@ModelAttribute Student s) {
		return studserv.addStudent(s);
	}
	
	@GetMapping("/displayStudent")
	public String readStudent(Model model) {
		List<Student> lstud = studserv.readStudent();
		model.addAttribute("students",lstud);
		return "displaydata";
	}
	
	@DeleteMapping("/deleteStudent/{roll}")
	public String deleteStudent(@PathVariable String roll) {
		return studserv.deleteStudent(roll);
		
	}
}
