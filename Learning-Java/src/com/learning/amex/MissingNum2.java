package com.learning.amex;
import java.util.*;
import java.util.stream.Collectors;
public class MissingNum2 {

	public static int findNum(int arr[], int n) {
	
		int sum = n*(n+1)/2;
		
		for(int i=0; i<n; i++)
			sum -= arr[i];
		return sum;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,3,7,5,6,2};
		
		List<Integer> l = Arrays.stream(arr).sorted().boxed()
				.collect(Collectors.toList());
		
		int newArr[] = l.stream().mapToInt(Integer::intValue).toArray();
		
		int n = arr.length;
		System.out.println(findNum(newArr,n));
		
	}

}
