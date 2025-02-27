package com.interview.java;
import java.util.*;
import java.util.stream.Collectors;
public class StringDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String multiLineString = "Bae\nldung helps \n \n developers \n explore Java.";
		
		List<String> lines = multiLineString.lines()
				.filter(line -> !line.isBlank())
				.map(String::strip)
				.collect(Collectors.toList());
		
		System.out.println(lines);
				

	}

}
