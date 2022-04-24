package com.pojo;

public class Student {

	private int id;
	
	private String name;
	
	private String rollnum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollnum() {
		return rollnum;
	}

	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollnum=" + rollnum + "]";
	}
	
	
	
	
}
