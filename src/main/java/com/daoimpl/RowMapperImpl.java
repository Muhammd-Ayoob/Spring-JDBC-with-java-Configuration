package com.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pojo.Student;

public class RowMapperImpl implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student= new Student();
		
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setRollnum(rs.getString("rollnum"));
		return student;
	}

}
