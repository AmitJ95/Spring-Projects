package com.learning.amex;

public class SingletonDemo {

	private static SingletonDemo singleInstance=null;
	
	public String s;
	
	private SingletonDemo() {
		s="singleton design pattern";
	}
	
	public static synchronized SingletonDemo getInstance() {
		
		if(singleInstance == null)
			singleInstance = new SingletonDemo();
		return singleInstance;
			
		
	}
}
