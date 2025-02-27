package com.learning.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class ExecutorDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		PrintJob[] jobs = {
				
				new PrintJob("durga"),
				new PrintJob("ravi"),
				new PrintJob("amit"),
				new PrintJob("shiva"),
				new PrintJob("naveen"),
				new PrintJob("manish")
		};
		
		
		ExecutorService service  = Executors.newFixedThreadPool(3);
		
		for(PrintJob job: jobs) {
		   Future<String> f =	service.submit(job);
		   System.out.println(f.get());
		}
		
		service.shutdown();
		
	}

}
