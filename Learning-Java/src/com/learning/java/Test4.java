package com.learning.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);

	//List<Integer> l1 = 	l.stream().filter(i-> i%2==0).collect(Collectors.toList());
		
		List<Integer> l1 = 	l.stream().map(x -> x*2).collect(Collectors.toList());
		l1.forEach(System.out::println);
		
		
		
		

	}

}
