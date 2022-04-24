package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cofig.Config;
import com.daoimpl.StudentDaoImpl;
import com.pojo.Student;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		
		StudentDaoImpl daoImpl= context.getBean("studentDao", StudentDaoImpl.class);
		
		
		//INSERTING DATA IN DATABASE
		
		/*Student student= new Student();
		
		student.setName("Turab");
		student.setRollnum("18CS45");
		daoImpl.insert(student);*/
		
		
		
		
		
		//UPDATING A SPECIFIC ROW IN DATABASE

		/*Student student= new Student();
		
		student.setId(5);
		student.setName("Turab Bajeer");
		student.setRollnum("18CS45");
		
		daoImpl.update(student);*/
		
		
		
		
		//DELETING SPECIFIC ROW FROM DATABASE
		
		//daoImpl.delete(5);
		
		
		
		
		//FETCHING A SINGLE ROW FROM DATABASE
		/*Student student= daoImpl.getStudent(4);
		
		System.out.println(student);*/
		
		
		
		//FETCHING ALL ROWS FROM DATABASE
		List<Student> list= daoImpl.getStudents();
		
		for(Student student: list)
		{
			System.out.println(student);
		}
		
		System.out.println("CONGRATES");
		
	}

}
