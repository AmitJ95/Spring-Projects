package com.learning.java;

public class SingletonDemo {

	private static SingletonDemo singleInstance = null;
	
	public String s;
	
	private SingletonDemo() {
		s = "from singleton demo";
	}
	
	public static synchronized SingletonDemo getInstance() {
		
		if(singleInstance==null)
			singleInstance =  new SingletonDemo();
		
		return singleInstance;
		
	}
}
