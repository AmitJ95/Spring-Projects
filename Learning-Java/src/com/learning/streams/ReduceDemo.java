package com.learning.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		
		System.out.println(intList.stream().reduce((a,b)-> a+b).get());
	}

}
