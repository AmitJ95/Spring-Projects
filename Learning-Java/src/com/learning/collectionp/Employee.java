package com.learning.collectionp;

import java.util.ArrayList;

public class Employee {

	public String name;
	public int age;

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Mohan",25));
		emp.add(new Employee("Akash",22));
		emp.add(new Employee("Pooja",28));
		emp.add(new Employee("Mohan",41));
		emp.add(new Employee("Amit",30));
		
		
		//after sorting on basis of age in descending order
		
		emp.stream().sorted(
				(e1,e2)-> e2.getName() == e1.getName()? e2.getAge().
						compareTo(e1.getAge()): e2.getName().
						compareTo(e1.getName()))
		.forEach(System.out::println);
		
		
	}
	

}
