package com.learning.dsa;

import java.util.ArrayList;



public class Employee {

	public String name;
	public int age;
	public int salary;

	Employee(String name, int age, int salary){
		this.name = name;
		this.age = age;
		this.salary = salary;	
	}
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Rakesh",45,41000));
		emp.add(new Employee("Sita",34,42000));
		emp.add(new Employee("Mohan",50,30000));
		emp.add(new Employee("Sneha",27,48000));
		emp.add(new Employee("Manish",41,50000));
		
//		emp.stream().filter(e -> e.getAge()>40 && e.getSalary()> 40000)
//		.forEach(e -> System.out.println(e.getName()));
		
        emp.stream().sorted((e1,e2) -> - e1.getAge().compareTo(e2.getAge()))
        .forEach(e -> System.out.println(e));
		
	}

}
