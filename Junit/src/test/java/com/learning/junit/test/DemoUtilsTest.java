package com.learning.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.learning.junit.DemoUtils;

public class DemoUtilsTest {

	DemoUtils demoUtils ;
	
	void setupBeforeEach() {
		demoUtils = new DemoUtils();
	}
	
	@Test
	void testEqualsAndNotEquals() {
		// set up

		 demoUtils = new DemoUtils();
		int expected = 6;
		int unexpected = 8;
		// execute
		int actual = demoUtils.add(2, 4);

		// assert
		assertEquals(expected, actual, "2+4 must be 6");
		assertNotEquals(unexpected, actual, "2+4 must not be 8");

	}

	@Test
	void testNullAndNotNull() {
		DemoUtils demoUtils = new DemoUtils();
		String str1 = null;
        String str2 = "abc";
		assertNull(demoUtils.checkNull(str1), "Object should be null");
		assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
	}
}
