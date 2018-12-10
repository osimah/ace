package com.sape.generic.program;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		
		/*
		Why are the rules for typing of arrays different from the rules for generic typing?
				Polymorphism does not work the same way for generics as it does with arrays.

		
		Object[] objArray = new String[3];
		List<Object> myList = new ArrayList<String>(); 
		List<Number> numbers = new ArrayList<Integer>(); // Integer is a subtype of Number
		*/
		//
		method("dfsdf", 45);
		Integer[] arr = {1, 2, 3, 4, 5};
		String[] ar = {"a", "b"};
		int a = printMiddleArr(arr);
		System.out.println(a);
		//GenericMethodTest.<String>(1, "sapient");
	}
	
	public static <T> void method(T a, T b){
		a = b;
		System.out.println(a);
		System.out.println(b);
	}


	
	public static <T> T printMiddleArr(T[] arr) {
		
		
		//System.out.println(arr[0].getClass());
		return arr[arr.length/2];
		
	}
	
	public static <T> void test(T t1, T t2) {
		t1 = t2;
		System.out.println(t1);
	}

}
