package com.learning.java;
import java.util.*;
import java.util.stream.Collectors;
public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(3);
		l.add(5);
		l.add(6);
		
		//l.stream().filter(i -> i%2==0).forEach(System.out::println);
		//l.stream().map(e -> e*2).forEach(System.out::println);
		//l.stream().sorted().forEach(System.out::println);
		
		//using customised sorting order
		l.stream().sorted((s1,s2)-> -s1.compareTo(s2)).
		forEach(System.out::println);
	}

}
