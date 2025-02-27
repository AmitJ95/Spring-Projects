package com.learning.java;

import java.util.*;

/*Given an array A of N elements. Find the majority element in the array.
A majority element in an array A of size N is an element that appears 
more than N/2 times in the array.
 
 
 
i/p: {8,6,6,6,8,6,6,6,4,6,7,7,7,7,7,7,7,7,7,7,7,}
o/p: 7
 
 
{1,2,3}
 
o/p: -1*/
public class TestInfo {

	public static int findMajority(int arr[]) {
		HashMap<Integer, Integer> m = new HashMap<>();

		int majorityElement = -1;
		for (int i : arr) {
			Integer val = m.getOrDefault(i, 0);
			m.put(i, ++val);

		}
		

		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {

			if (entry.getValue() > arr.length / 2)
				majorityElement = entry.getKey();

		}

		return majorityElement;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 8, 6, 6, 6, 8, 6, 6, 6, 4, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7 };
		System.out.println("Majority Element is: " + findMajority(arr));
	}

}
