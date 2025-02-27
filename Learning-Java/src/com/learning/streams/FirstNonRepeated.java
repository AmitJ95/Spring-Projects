package com.learning.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   String input = "Java articles are Awesome";
		   
		 Character result = input.chars()
				 .mapToObj(s -> Character.toLowerCase((char)s))//First convert to Character object and them to lower case
		        .collect(Collectors.groupingBy(Function.identity(),
		        		LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
                
       System.out.println(result);         
		 //result.forEach(System.out::println);

/*		 Set<Entry<Character, Long>> result =  input.chars()
				 .mapToObj(s -> Character.toLowerCase((char)s))//First convert to Character object and them to lower case
		        .collect(Collectors.groupingBy(Function.identity(),
		        		LinkedHashMap::new, Collectors.counting()))
		        .entrySet();

		 result.forEach(System.out::println);
*/	    
	    
	    
		 
			
		 
	}

}
