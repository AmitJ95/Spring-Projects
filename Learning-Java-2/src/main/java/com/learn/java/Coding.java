package com.learn.java;
import java.util.*;

import static java.util.List.of;
import java.util.PrimitiveIterator.OfDouble;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        /**
         * Separate odd and even numbers in a list of integers.
         *
         * Given a list of integers, write a Java 8 program to separate
         * the odd and even numbers into two separate lists.
         */
		
		//separationOfEvenOddNumberinList();
		
		
        /**
         * Remove duplicate elements from a list using Java 8 streams
         *
         * Write a Java 8 program to remove duplicate elements from a list
         * using the stream API and lambda expressions.
         */
		
		//removeDuplicateFromList();
		
		/**
         * Find the frequency of each character in a string using Java 8 streams
         *
         * Write a Java 8 program to find the frequency of each character in
         * a given string using the stream API and collectors.
         */
		
		//characterFrequency();
		
		/**
         * Find the frequency of each element in an array or a list
         *
         * Write a Java 8 program to find the frequency of
         * each element in an array or a list using streams and collectors.
         */
		
		//wordFrequency();
		
		/**
         * Sort a given list of decimals in reverse order
         *
         * Write a Java 8 program to sort a given list of decimal numbers in reverse order.
         */
		
		  //reverseSortedList();
		  
		/**
         * Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
         *
         * Given a list of strings, write a Java 8 program to join the strings
         * with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.
         */
		  
		 // joinListOfStrings();
		  
		  /**
	         * Print the numbers from a given list of integers that are multiples of 5
	         *
	         * Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.
	         */
		  
		 // multipleOf5();
		  
		  /**
	         * Find the maximum and minimum of a list of integers
	         * Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.
	         */

		  
		  minMaxFromList();

	}
	

	private static void separationOfEvenOddNumberinList() {
		List<Integer> oneToTen  = of(1,2,3,4,56,7,8,9,10);
		
	    Collection<List<Integer>> evenOddList = oneToTen.stream()
	    		.collect(collectingAndThen(partitioningBy(i -> i%2 == 0),
	    				Map::values));
	    
	    System.out.println(evenOddList);
	}
	
	private static void removeDuplicateFromList() {
		
		List<Integer> oneToTen = of(1,2,3,4,5,6,7,8,9,10,4);

		List<Integer> removeDuplicate = oneToTen.stream().distinct().collect(toList());

		System.out.println(removeDuplicate);
		
		Set<Integer> removeDuplicateWithoutOrder = oneToTen.stream().collect(toSet());
		
		System.out.println("removeDuplicateWithoutOrder"+removeDuplicateWithoutOrder);
		
	}
	
	private static void characterFrequency() {
		String name = "amitjain";
		
		Map<String,Long> characterFrequency = Arrays.stream(name.split(""))
         .collect(groupingBy(Function.identity(),counting()));	
		System.out.println(characterFrequency);
		
	}
	
	private static void wordFrequency() {
		List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
		
		Map<String,Long> frequencyWords = names.stream()
				.collect(groupingBy(Function.identity(),counting()));
		
		System.out.println(frequencyWords);
	}

	private static void reverseSortedList() {
		 List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
		 
		 System.out.println(randomNumbers);
		 
     List<Integer> sortInReverse = randomNumbers.stream()
    		 .sorted((x,y) -> Integer.compare(y, x))
    		 .collect(toList());
     System.out.println(sortInReverse);
     
//     List<Integer> ascendingSort = randomNumbers.stream()
//    		 .sorted((x,y) -> Integer.compare(x, y))
//    		 .collect(toList());
//     
//     System.out.println(ascendingSort);
		 
	 
	}

     
	private static void joinListOfStrings() {
		
		List<String> languageList = of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
        String joinWithPrefixSuffixAndDelimiter = languageList
        		.stream()
        		.collect(joining(",","[","]"));
        
        System.out.println(joinWithPrefixSuffixAndDelimiter);
		
	}

	
	private static void multipleOf5() {
		List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
	
	   List<Integer> multipleOf5 = randomNumbers.stream()
			   .filter(n -> n%5 ==0)
			   .collect(toList());
	   
	   System.out.println(multipleOf5);
	
	}

	private static void minMaxFromList() {
		List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
		
		
	Integer maxNumber = randomNumbers.stream()
			.max(Integer::compareTo)
			.orElse(Integer.MAX_VALUE);
	
	  System.out.println(maxNumber);
	  
	}
}


