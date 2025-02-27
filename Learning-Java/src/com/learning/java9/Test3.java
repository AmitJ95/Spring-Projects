package com.learning.java9;

public class Test3 {

	public String s = "abc";
	
	
	Test3(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		System.out.println("t1: "+t1.hashCode());
		System.out.println("t2: "+t2.hashCode());
		
	}

}
