package com.Jdbc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Jdbc.dao.JdbcDaoImpl;
import com.Jdbc.demo.model.UserDetails;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
		
		UserDetails user = new JdbcDaoImpl().getUserDetails(1);
		System.out.println(user.getUserid());
	}

}
