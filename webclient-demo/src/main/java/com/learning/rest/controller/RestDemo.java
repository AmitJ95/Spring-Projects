package com.learning.rest.controller;

import java.util.Arrays;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class RestDemo {

	private String url = "https://jsonplaceholder.typicode.com/todos";
	
	WebClient.Builder webClient = WebClient.builder();
	
	@GetMapping("/get")
	public void getApi() {
		
	Mono<Todos[]> response = 	webClient.build().get().uri(url).accept(MediaType.APPLICATION_JSON)
		.retrieve().bodyToMono(Todos[].class).log();

		//Fetching few records using next method
	Mono<Todos[]> responses = 	webClient.build().get().uri(url).accept(MediaType.APPLICATION_JSON)
			.retrieve().bodyToMono(Todos[].class).log();
	
	Todos[] todo = response.block();
	
	Arrays.stream(todo).map(Todos::getTitle).forEach(System.out::println);
	
	}
	
}
