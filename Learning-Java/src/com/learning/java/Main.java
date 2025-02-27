package com.learning.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = TestDemo::m1;
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main thread");
		}
	}

}
