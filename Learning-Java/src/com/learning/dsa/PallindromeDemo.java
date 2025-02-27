package com.learning.dsa;

public class PallindromeDemo {

	
	/*static int reverse(int n) {
		int rev = 0;
		int rem;
		
		while(n>0) {
			rem = n%10;
			rev = (rev*10)+rem;
			n = n/10;
		}
		return rev;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2002;
		//System.out.println("Reversed number is "+reverse(n));
		
	/*	if(n==reverse(n)) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}*/
	//space-time complexity of above solution
	//time complexity -> O(log n), space complexity -> O(log n)
	
	//another solution	
		String temp = ""+n;
		StringBuilder sb = new StringBuilder(temp);
		StringBuilder str = sb.reverse();
		System.out.println(str.toString());
		if(temp.equals(str.toString())) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	//Time complexity -> O(ln)
	// space complexity -> O(n)	
		
		
		
		
		
				
	}

}
