package com.javatechie.webflux;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

	@Disabled
	public void testMono() {
		Mono<?> monoString = Mono.just("javatechie")
				.then(Mono.error(new RuntimeException("Exception Occured")))
				.log() ;
		
		monoString.subscribe(System.out::println);
	}
	
	@Test
	public void testFlux() {
		Flux<String> fluxString = Flux.just("Spring","Spring Boot","Hibernate","microservice").log();
		fluxString.subscribe(System.out::println);
	}
}
