package com.cofig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.daoimpl.StudentDaoImpl;

@Configuration
public class Config {

	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		
		dataSource.setUsername("root");
		
		dataSource.setPassword("admin");
		
		return dataSource;
	}
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}
	
	
	@Bean(name = "studentDao")
	public StudentDaoImpl getDaoImpl()
	{
		StudentDaoImpl daoImpl= new StudentDaoImpl();
		
		daoImpl.setJdbcTemplate(getJdbcTemplate());
		
		return daoImpl;
	}
	
	
}
