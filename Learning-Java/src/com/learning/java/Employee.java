package com.learning.java;

import java.util.ArrayList;

//wap to sort employee objects in descending order
public class Employee {
	
	public String name;
	public int age;
	
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Rakesh",21));
		emp.add(new Employee("Sita",34));
		emp.add(new Employee("Mohan",50));
		emp.add(new Employee("Sneha",27));
		emp.add(new Employee("Manish",32));
		
		emp.stream().sorted((e1,e2)-> - e1.getAge().compareTo(e2.getAge()))
		.forEach(System.out::println);
		

	}

}
