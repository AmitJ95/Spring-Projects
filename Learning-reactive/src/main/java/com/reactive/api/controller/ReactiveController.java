package com.reactive.api.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class ReactiveController {

	
	@Autowired
	private WebClient.Builder webClientBuilder;
		
	@GetMapping("/getData")
	public void consumeApi() {
		try {
		Mono<Todos[]> response = webClientBuilder.build()
				                 .get()
				                 .uri("https://jsonplaceholder.typicode.com/todos")
                                 .accept(MediaType.APPLICATION_JSON)
                                 .retrieve().bodyToMono(Todos[].class)
                                 .log();
		
		
		Todos[] todo = response.block();
		
		Arrays.stream(todo).map(Todos::getUserId)
		.forEach(System.out::println);
		
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
