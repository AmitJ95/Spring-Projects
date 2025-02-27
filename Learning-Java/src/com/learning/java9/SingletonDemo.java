package com.learning.java9;
//famous interview question
public class SingletonDemo {

		private static SingletonDemo singleInstance = null;
		
		public String s;
		
		private SingletonDemo() {
			s="singleton demo";
		}
		
		public static synchronized SingletonDemo getInstance() {
			
			if(singleInstance==null) 
				singleInstance = new SingletonDemo();
			
			
			return singleInstance;
			
				
		}
}
