package com.learning.java;

class Sample{
	private String s;
	Sample(String s){
		this.s = s;
		System.out.println("Constructor Executed: "+s);
	}
}

interface Interf1{
	public Sample get(String s);
}
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interf1 f =  s -> new Sample(s);
		f.get("From lambda expression");
		
		Interf1 f1= Sample::new;
		f1.get("From Constructor refernce");

	}

}
