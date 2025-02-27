package com.security.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService  userDetailsService() {
		
		//InMemoryUserDetailsManager userDetails = new InMemoryUserDetailsManager();
		//above stmt can also be written as 
		
		var userDetails = new InMemoryUserDetailsManager();
		
			//var encoder = new BCryptPasswordEncoder();
		var encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		
		var user = User.withUsername("progrank")
				.password(encoder.encode("secrets"))
				.authorities("read")
				.build();
		
		userDetails.createUser(user);
		
		return userDetails;
			
	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	
}
