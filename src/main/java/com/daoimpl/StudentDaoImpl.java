package com.daoimpl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Student;

public class StudentDaoImpl {

	JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	public void insert(Student student)
	{
		String query="insert into student(name, rollnum) values(?,?)";
		
		jdbcTemplate.update(query, student.getName(), student.getRollnum());
	
	}
	
	public void update(Student student)
	{
		String query= "update student set name=?, rollnum=? where id=?";
		jdbcTemplate.update(query, student.getName(), student.getRollnum(), student.getId());
	}
	
	
	
	public Student getStudent(int id)
	{
		String query="select * from student where id=?";
		
		RowMapper<Student> rowMapper= new RowMapperImpl();
		
		Student student= jdbcTemplate.queryForObject(query, rowMapper, id);
		
		return student;
	}
	
	public List<Student> getStudents()
	{
		String query= "select * from student";
		
		RowMapper<Student> rowMapper= new RowMapperImpl();
		
		List<Student> list= jdbcTemplate.query(query, rowMapper);
		
		return list;
	}
	
	
	public void delete(int id)
	{
		String query="delete from student where id=?";
		
		jdbcTemplate.update(query, id);
	}
}
