package com.learning.java;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonDemo t1 = SingletonDemo.getInstance();
		System.out.println("t1: "+t1.hashCode());
		
		SingletonDemo t2 = SingletonDemo.getInstance();
		System.out.println("t2: "+t2.hashCode());
	}

}
