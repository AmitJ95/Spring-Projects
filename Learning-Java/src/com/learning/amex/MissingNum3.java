package com.learning.amex;

public class MissingNum3 {

	public static void printMissingElements(int arr[], int N)
	  {
	    int cnt = 0;
	    for (int i = arr[0]; i <= arr[N - 1]; i++)
	    {
	 
	      // Check if number is equal to the first element in
	      // given array if array element match skip it increment for next element
	      if (arr[cnt] == i)
	      {
	 
	        // Increment the count to check next element
	        cnt++;
	      }
	      else
	      {
	 
	        // Print missing number
	        System.out.print(i + " ");
	      }
	    }
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[] = { 1,1,2,3,4,6 };
		int arr[] = {-1,-3};
	    int N = arr.length;
	    printMissingElements(arr, N);

	}

}
