package com.learning.java9;

public class MyResource implements AutoCloseable {

	
	MyResource(){
		System.out.println("Resource Creation");
	}
	
	public void doProcess() {
		System.out.println("Resource Processing..");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Resource Closing..");
		
	}

}
