package com.interview.amex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PrintJob [] jobs = {
				
				new PrintJob("amit"),
				new PrintJob("ravi"),
				new PrintJob("manish"),
				new PrintJob("neha"),
				new PrintJob("rohan"),
				new PrintJob("utkarsh")
		};
		
		//ExecutorService service = Executors.newFixedThreadPool(3);
		
		ExecutorService service = 
		
		for(PrintJob j: jobs) {
			
			service.submit(j);
			
		}
		
		service.shutdown();
		
		
	}

}
