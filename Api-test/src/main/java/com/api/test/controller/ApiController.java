package com.api.test.controller;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController

public class ApiController {

	
//  @Value("${external.server.url}")
//  String url;
  @Autowired
 private WebClient.Builder webClientBuilder;
  
  
  
  private static final Logger log = LoggerFactory.getLogger(ApiController.class);
     RestTemplate restTemplate = new RestTemplate();
     
     @GetMapping("/call")
     public void callApi() {
    	 try {
    		 
    	Mono<Todos[]> response =  webClientBuilder.build().get().uri("https://jsonplaceholder.typicode.com/todos")
				.accept(MediaType.APPLICATION_JSON)
    			.retrieve().bodyToMono(Todos[].class).log();
    	
    	Todos[] todo = response.block();
    	
      	Arrays.stream(todo).map(Todos::getUserId).forEach(System.out::println);
    	
    					
    	
    
    		    
    		 
    		 		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    
    	 
    	 
     }
	
	
}
