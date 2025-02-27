package com.learning.java;

public final class Student {

	private final String name;
	private final int id;
	
	
	public Student( String name, int id) {
		this.name=name;
		this.id = id;
	}
	
	public String getName() {
		return name;
		
	}
	public int getId() {
		return id;
	}
}
