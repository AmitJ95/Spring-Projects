package com.learning.amex;

import java.util.*;
import java.util.stream.Collectors;

//given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//[1,1,2,3,4,6]

/*int n = nums.length;
 * 
int totalSum = n*(n+1)/2;
for(int i=0;i<n;i++){
    totalSum -= nums[i];
    21 = 21 -1;//20 0
    20 = 20 -1;//19 1
    19 = 19 -2;//17 2
    17 = 17 -3;//14 3
    14 = 14 -4;//10 4
    10 = 10 -6;//4  5
    
    21 = 21 -1;//20 0
    20 = 20 -2;//18 1
    19 = 18 -3;//15 2
    17 = 15 -4;//11 3
    14 = 11 -6;//5  4
   
   
   //2nd test case
    * 6 = 6-1// 5 0
    * 5 = 5-2// 3 1
    * 3 = 3-3// 0 2
    
  //3rd test case
   * 0 = 0-(-1) 1 0
   * 1 = 1-(-3) 
  
  
    
}
return totalSum;
}*/
public class MissingNum {

	public static void findMissing(int arr[], int N) {
		
		int i;
		int temp[] = new int[N+1];
		
		for (i = 0; i <= N; i++) {
            temp[i]= 0;
		}
		
		for(i=0; i<N; i++) {
			
			temp[arr[i]-1] = 1;
		}
		int ans=0;
		
		for (i = 0; i <= N; i++) {
              if(temp[i]==0)
					ans = i + 1;
		}
		System.out.println(ans);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,3,7,5,6,2};
		//int arr[] = {1,2,3,5,6,7};
		//int arr[] = {1, 3, 6, 4, 1, 2};returns incorrect output
	    //int arr[] = {-1,-3};-code doesn't work for this test case
        int n = arr.length;
		findMissing(arr,n);

	}

}
