package com.learning.java;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadDemo t = new ThreadDemo(){
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println("Child Thread");
				}
			}
		};
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
