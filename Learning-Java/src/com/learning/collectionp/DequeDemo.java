package com.learning.collectionp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Stream;

//Array rotation program
/*Given an array of integers arr[] of size N and an integer,
the task is to rotate the array elements to the left by d positions.*/

/*
 * Input: 
arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
Output: 3 4 5 6 7 1 2

Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2
Output: 5 6 7 1 2 3 4


 */

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6,7};
		int d = 2;
		
		Deque<Integer> deq = new ArrayDeque<>();
		
		for(int i: arr) {
			deq.add(i);
		}
		
		
		for(int i=0; i<d; i++) {
			int temp = deq.remove();
			deq.addLast(temp);
		}
		System.out.println(deq);
		
	}

}
