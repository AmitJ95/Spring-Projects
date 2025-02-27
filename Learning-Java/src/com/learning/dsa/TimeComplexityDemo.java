package com.learning.dsa;

public class TimeComplexityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double now  = System.currentTimeMillis();
		
		TimeComplexityDemo demo = new TimeComplexityDemo();
		System.out.println(demo.findSum(99999));
		System.out.println("time taken - "+(System.currentTimeMillis()-now) +" millisecs.");

	}
	
	
//	public int findSum(int n) {
//		return n*(n+1)/2;
//	}
	
	public int findSum(int n) {
		int sum = 0;
		
		for(int i = 1; i<=n; i++) {
			sum = sum+ i;
		}
		return sum;	
	}

}
