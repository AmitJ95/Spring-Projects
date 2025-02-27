package com.learning.collectionp;

import java.util.ArrayList;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(17);
		l.add(4);
		l.add(8);
		l.add(7);
		l.add(6);
		//filter method
		//l.stream().filter(e -> e%2==0).forEach(System.out::println);
		
		//map method
		//l.stream().map(e -> e+2).forEach(System.out::println);
		
		//sorted method (dnso which is ascending order)
		//l.stream().sorted().forEach(System.out::println);
		
		//sorted method (customised sorting order using comparator
		//interface)
		
		l.stream().sorted((s1,s2) -> s2.compareTo(s1)).
		forEach(System.out::println);

	}

}
