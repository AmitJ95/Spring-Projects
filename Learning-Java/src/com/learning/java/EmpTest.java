package com.learning.java;

public class EmpTest {

	private String name;
	private int id;
	
	public EmpTest(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EmpTest [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}
