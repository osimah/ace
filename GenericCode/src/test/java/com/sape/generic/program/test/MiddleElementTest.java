package com.sape.generic.program.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;



import org.junit.BeforeClass;
import org.junit.Test;

import com.sape.generic.program.MiddleElement;

public class MiddleElementTest {
	
	private static MiddleElement middleEle;
	@BeforeClass
	public static void setUp() {
		middleEle = new MiddleElement();
	}
	
	@Test
	public void middleTest() {
		String[] strArr = {"a", "b", "c", "f"};
		String midElement = middleEle.middleElement(strArr);
		assertEquals("c", midElement);
		//System.out.println(midElement);
	}
	
	@Test
	public void testMiddleInt() {
		Integer[] arr = {1, 4, 7, 0, 10, 3, 3};
		int mid = middleEle.middleElement(arr);
		assertEquals(0,mid);
	}
	
	@Test
	public void testMiddlefail() {
		Integer[] arr = {1, 4, 7, 0, 10, 3, 3};
		int mid = middleEle.middleElement(arr);
		assertNotEquals(3, mid);
	}

}
