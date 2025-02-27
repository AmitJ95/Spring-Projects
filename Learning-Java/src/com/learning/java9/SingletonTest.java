package com.learning.java9;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r1 = () -> {

			SingletonDemo x = SingletonDemo.getInstance();
			System.out.println("Hashcode of x: " + x.hashCode());
			System.out.println("from x: "+x.s);
			System.out.println(""+Thread.currentThread().getId());
		};
		
		
		new Thread(r1).start();
		// SingletonDemo x = SingletonDemo.getInstance();
		SingletonDemo y = SingletonDemo.getInstance();
//		System.out.println("Hashcode of x: "+x.hashCode());
 		System.out.println("Hashcode of y: "+y.hashCode());
 		y.s = (y.s).toUpperCase();
		System.out.println("from y: "+y.s);
 		System.out.println(""+Thread.currentThread().getId());
//		
		
//		System.out.println("from y: "+y.s);

		
		


	}

}
