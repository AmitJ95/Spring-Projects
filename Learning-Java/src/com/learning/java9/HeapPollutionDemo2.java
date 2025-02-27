package com.learning.java9;

import java.util.Arrays;
import java.util.List;

public class HeapPollutionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = Arrays.asList("A", "B");
		List<String> l2 = Arrays.asList("C", "D");

		m1(l1, l2);
	}

	@SafeVarargs
	public static void m1(List<String>... l) {
		for (List<String> l1 : l) {
			System.out.println(l1);
		}
	}

}
