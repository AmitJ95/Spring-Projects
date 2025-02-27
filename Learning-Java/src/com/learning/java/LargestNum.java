package com.learning.java;
import java.util.*;
public class LargestNum {

//	public static int getLargest(int numbers[]) {
//		int largest = Integer.MIN_VALUE;//signifies min value i.e. infinity
//		System.out.println(largest);
//		for(int i=0; i<numbers.length; i++) {
//			if(largest < numbers[i]) {
//				largest = numbers[i];
//			}
//		}
//		
//		return largest;
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int numbers[] = {1,2,6,3,5};
//		System.out.println("largest value is: "+getLargest(numbers));
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		//l.remove(Integer.valueOf(1));
		System.out.println(l.indexOf(3));
		
	}

}
