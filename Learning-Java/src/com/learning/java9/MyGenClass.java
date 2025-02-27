package com.learning.java9;

public class MyGenClass<T> {

	T obj;
	
	public MyGenClass(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	
	public void doProcess() {
		System.out.println("Processing...");
	}
}
