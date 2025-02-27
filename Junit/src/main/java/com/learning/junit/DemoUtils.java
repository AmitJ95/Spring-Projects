package com.learning.junit;

import java.util.ArrayList;

public class DemoUtils {

	public int add(int a, int b) {
		return a + b;
	}
	
	public Object checkNull(Object obj) {
		
		if(obj != null) {
			return obj;
		}
		return null;
	}

}
