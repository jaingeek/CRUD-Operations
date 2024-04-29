package com.example.sbweb.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sbweb.entity.Student;
import com.example.sbweb.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentRepository studrepo;
	
	// We can also use @AutoWired Annotation
//	public StudentServiceImplementation(StudentRepository studrepo) {
//		super();
//		this.studrepo = studrepo;
//	}


	@Override
	public String addStudent(Student s) {
		studrepo.save(s);
		return "createstudentsuccess";
	}

	@Override
	public List<Student> readStudent() {
		List<Student> listStud = studrepo.findAll();
		return listStud;
	}

	@Override
	public String deleteStudent(String roll) {
		studrepo.deleteById(roll);
		return "deletesuccess";
	}

}
