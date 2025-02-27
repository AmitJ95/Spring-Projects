package com.learning.java9;
//famous interview question
//Immutable class
final class Student {

	private final String name;
	private final int id;
	
	
	public Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
}
	