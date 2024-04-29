package com.example.sbweb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	String roll;
	String name;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String roll, String name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
