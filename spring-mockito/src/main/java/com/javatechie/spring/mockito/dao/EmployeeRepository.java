package com.javatechie.spring.mockito.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.mockito.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	
}
