package com.Jdbc.demo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
		List<Integer> l  = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(16);
		l.add(32);
		l.add(64);
		
		for (int i=0; i<=l.size(); i++) {
			//int j = l.get(i);
//			if(i==l.size()-1) {
//				break;
//			}
			if(!(i==l.size())) {
				if(2*l.get(i)<= l.get(i+1)) {
					l.remove(i);
				}	
			}
			
			
		}
		System.out.println(l.size());
	}	

}
