package com.learning.multithreading;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ScheduledExecutorService;
public class PrintJob implements Callable{

	String name;
	
	
	
	public PrintJob(String name) {
		super();
		this.name = name;
	}

	public String call() {
		
		System.out.println(name+"...Job started by Thread: "+
		Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(name+"...Job completed by Thread: "+
				Thread.currentThread().getName());
		return "Method call completed";
		
	}

	

	

}
