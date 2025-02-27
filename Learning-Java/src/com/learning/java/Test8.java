package com.learning.java;
//Method refernce demo using static method
public class Test8 {

	public static void m1() {
		for(int i=0; i<=10; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable r = Test8::m1;
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<=10; i++) {
        	System.out.println("Main Thread");
        }
	}

}
