package com.learning.java;

interface Interf{
	public void m1(int i);
}

public class Test9 {

	public void m2(int i) {
		System.out.println("From Method Reference "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interf f = i -> System.out.println("From lambda expression: "+i);
		f.m1(10);
		
		Test9 t = new Test9();
		Interf i1 = t::m2;
		i1.m1(10);
		
	}

}
