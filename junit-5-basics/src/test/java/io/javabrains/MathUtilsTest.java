package io.javabrains;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	void test() {

		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "Should return sum as 2");
	}

	@Nested
	class AddTest {
		@Test
		@DisplayName("Testing add method for +")
		void testAddPositive() {
			assertEquals(2, mathUtils.add(1, 1), "The add method should add two numbers");
		}

		@Test
		@DisplayName("Testing add method - ")
		void testAddNegative() {
			assertEquals(-2, mathUtils.add(-1, -1), "The add method should add numbers");
		}

	}

	

//	@Test
//	void testComputeCircleArea() {
//		MathUtils mathUtils  = new MathUtils();
//		assertEquals(314.15927,mathUtils.computeCircleArea(10),"Should return"
//				+ "right circle area");
//	}

	@Test
	void testDivide() {

		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),
				"divide by zero should throw arithmetic exception");
	}

	@Test
	void testMultiply() {
		assertAll(() -> assertEquals(4, mathUtils.multiply(2, 2)), () -> assertEquals(0, mathUtils.multiply(2, 0)),
				() -> assertEquals(-2, mathUtils.multiply(2, -1)));
	}

}
