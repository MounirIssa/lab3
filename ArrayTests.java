import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
		int[] input1 = { 3 };
		ArrayExamples.reverseInPlace(input1);
		assertArrayEquals(new int[]{ 3 }, input1);
	}


	@Test
	public void testReversed() {
		int[] input1 = { };
		assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
	}

	@Test
	public void testInPlace() {
		int[] input3 = {1, 2, 3};
		ArrayExamples.reverseInPlace(input3);
		assertArrayEquals(new int[] {3, 2, 1}, input3);
	}

	@Test 
	public void testReverse() {
	  int[] input2 = {1, 2, 3};
		assertArrayEquals(new int[] {3, 2, 1} ,ArrayExamples.reversed(input2));
		
	}
}
