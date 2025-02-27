package com.learning.java;
import java.util.function.*;
public class Test6 {

	    public static void main(String[] args) {
	    	/*Thread t = new Thread(()->{
	    		
	    		for(int i=0; i<10; i++) {
	    			System.out.println("Child Thread");
	    		}
	    	});
	    	t.start();
	    	for(int i=0; i<10; i++) {
	    		System.out.println("Main Thread");
	    	}*/
	    	
	    	//Predicate<Integer> p = i ->(i>10);
	    	//System.out.println(p.test(1));
	    	Function<String,Integer> f = s -> s.length();
	    	System.out.println(f.apply("Durga"));
		}
		
	}

