package com.learning.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<EmpTest> emp = new ArrayList<>();
		emp.add( new EmpTest("amit",12));
		emp.add( new EmpTest("Basheer",24));
		emp.add( new EmpTest("Lucifer",6));
		emp.add( new EmpTest("Diggles",34));
		emp.add( new EmpTest("John",5));
		
		//sorting in ascending order using name
		System.out.println("Before sorting------");
		emp.forEach(System.out::println);
		
		System.out.println("After sorting------");
		
	     emp.stream().sorted((e1,e2) ->
	    	 e1.getName().equals(e2.getName()) ?  
	    			 e1.getId().compareTo(e2.getId()):
	    				 e1.getName().compareTo(e2.getName())).forEach(System.out::println);
	     
	     //emp.forEach(System.out::println);
	}

}
