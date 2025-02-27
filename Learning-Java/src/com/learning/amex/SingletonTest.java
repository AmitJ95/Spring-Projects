package com.learning.amex;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonDemo t1 = SingletonDemo.getInstance();
		System.out.println(t1.hashCode());
		System.out.println(t1.s);
		
		SingletonDemo t2 = SingletonDemo.getInstance();
		System.out.println(t2.hashCode());
		
		
	}

}
