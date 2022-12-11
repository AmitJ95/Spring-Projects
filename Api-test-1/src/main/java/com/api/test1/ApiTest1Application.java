package com.api.test1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class ApiTest1Application {
	private static final Logger log = LoggerFactory.getLogger(ApiTest1Application.class);
	public static void main(String[] args) {
		SpringApplication.run(ApiTest1Application.class, args);
	}
	@GetMapping("/calls")
	public void callApis() {
		WebClient client = WebClient.create("https://jsonplaceholder.typicode.com");

//		Mono<Todos> result = client.get()
//		        .uri("/todos/{id}", new Todos().getId()).accept(MediaType.APPLICATION_JSON)
//		        .retrieve()
//		        .bodyToMono(Todos.class);
	         // log.info(result.toString()) ;
		Mono<Todos> result = client.get()
		        .uri("/todos/{id}", new Todos().getId()).accept(MediaType.APPLICATION_JSON)
		        .retrieve()
		        .bodyToMono(Todos.class);     
	         
	         
	        // ObjectMapper obj = new ObjectMapper();
	         
	         
	}
	
	

}
