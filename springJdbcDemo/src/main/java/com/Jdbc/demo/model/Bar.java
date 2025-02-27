package com.Jdbc.demo.model;

abstract class Bar extends Foo{
    int a;
	Bar(int a){
		super(a);
		this.a=a;
	}
	public void m1(int a) {
		System.out.println("Bar");
		
	}
	
}
