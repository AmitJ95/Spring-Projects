package com.interview.amex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//o/p -> b
//list of inetegers need to find max value element 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	List<Integer> l = new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	
	//l.stream().max((i1,i2) -> i1.compareTo(i2)).get();
     //System.out.println(l.stream().max((i1,i2) -> i1.compareTo(i2)).get());	
	//min
	System.out.println(l.stream().min((i1,i2) -> i1.compareTo(i2)).get());
	
	
	}

}
