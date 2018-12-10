package com.sape.generic.program;

public class GenericCall {

	public static void main(String[] args) {
		Integer[] arr =  {1, 2, 3, 5, 6};
		GenericMethodTest.<Integer>printMiddleArr(arr);

	}

}
