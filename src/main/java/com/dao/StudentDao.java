package com.dao;

import java.util.List;

import com.pojo.Student;

public interface StudentDao {

	public void insert(Student student);
	
	public void update(Student student);
	
	public Student getStudent(int id);
	
	
	public List<Student> getStudents();
	
	public void delete(int id);
}
