package com.example.sbweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbweb.entity.Student;

public interface StudentRepository extends JpaRepository<Student,String>{

}
