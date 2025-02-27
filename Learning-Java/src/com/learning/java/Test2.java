package com.learning.java;

public class Test2 {

	public static void m1() {
		
		for(int i=0; i<=10; i++) {
			System.out.println("Child Thread"+i);
			
		}
	}
	
	public static void main(String[] args) {
		
//		
//		Runnable r = ()->{
//		     
//			for(int i=0; i<=10; i++) {
//				System.out.println("Child Thread"+i);
//				
//			}
//			
//            
//		};
		Runnable r = Test2::m1;
		
		Thread t = new Thread(r);
        t.start();
        for(int i=0; i<=10; i++) {
			System.out.println("Main Thread"+i);
			
		}
	}
}
