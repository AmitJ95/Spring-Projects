package com.learning.dsa;

public class ReverseArray {

	public static void reverse(int numbers[]) {
		int first = 0, last = numbers.length-1;
		
		while(first<last) {
			int temp = numbers[last];
			numbers[last] = numbers[first];
			numbers[first] = temp;
			
			first++;
			last--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = {2,4,6,8,10};
		
		reverse(numbers);
		
		for(int n: numbers) {
			System.out.print(n +",");
		}
	}

}
