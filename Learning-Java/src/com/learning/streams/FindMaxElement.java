package com.learning.streams;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		int max = myList.stream()
				.max(Integer::compare)
				.get();
		System.out.println(max);
	}

}
