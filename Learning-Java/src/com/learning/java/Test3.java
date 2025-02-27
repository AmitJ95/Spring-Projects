package com.learning.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test3 {

	public static char getMaxOccurence(char[] ch1) {
		
		Map<Character,Integer> m = new HashMap<>();
		List<Integer> l = new ArrayList<>();
		char c = 0;
		for(char s: ch1) {
		   if(m.containsKey(s)) {
			   m.put(s, m.get(s)+1);
		   }else {
			   m.put(s, 1);
		   }
		}
		
		for(char s: ch1) {
			
		  Integer a =  m.get(s);
		   l.add(a);
		}
		
		Integer maxInt = l.stream().max(Integer::compare).get();
		 
		for(Entry<Character,Integer> entry: m.entrySet()) {
			if(entry.getValue().equals(maxInt)) {
				c =  entry.getKey();
			}
		}
		
		
		
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeks";
		char ch[] = str.toCharArray();
		System.out.println(getMaxOccurence(ch));
		
	}

}
