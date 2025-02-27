package com.interview.amex;

public class PrintJob implements Runnable {

	String name;
	
	
	PrintJob(String name){
		this.name = name;
	}
	
	
	public void run() {
		
		System.out.println("Job started by: "+name +" "+Thread.currentThread().getName());
		
		try {
			
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("Job completed by: "+name +" "+Thread.currentThread().getName());
		
		
		
	}
	
	
}
