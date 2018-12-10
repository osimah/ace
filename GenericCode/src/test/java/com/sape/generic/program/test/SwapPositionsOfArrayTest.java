package com.sape.generic.program.test;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;



import com.sape.generic.program.SwapPositionsOfArray;

public class SwapPositionsOfArrayTest {
	
	
	private static SwapPositionsOfArray swapArr;
	
	@BeforeClass
	public static void setUp() {
		swapArr = new SwapPositionsOfArray();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSwapArray1() {
		Integer[] arr = {1, 4, 5, 8, 0};
		//Integer[] arr1 = {1, 4, 8, 5, 0};
		Integer[] int1 =  swapArr.swapPositions(arr, 2, 4);
		
		assertEquals(arr, int1);
	}
	
	@Test(expected= ArrayIndexOutOfBoundsException.class)
	public void testException() {
		Integer[] arr = {1, 4, 5, 8, 0};
		//Integer[] arr1 = {1, 4, 8, 5, 0};
		Integer[] int1 =  swapArr.swapPositions(arr, 2, 5);
		System.out.println(int1);
		
	}
	
	
	
	/*String[] strArr = {"v", "x", "a", "e", "z", "t","y"};
	swapPositions(arr, 2, 3);
	swapPositions(strArr, 1, 5);*/

}
