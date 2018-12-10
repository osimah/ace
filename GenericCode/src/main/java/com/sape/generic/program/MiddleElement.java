package com.sape.generic.program;

public class MiddleElement {

	/*public static void main(String[] args) {
		
		String[] strArr = {"a", "b", "c", "f"};
		String midElement = middleElement(strArr);
		System.out.println(midElement);
		Integer[] arr = {1, 4, 7, 0, 10, 3, 3};
		Integer mid = middleElement(arr);
		System.out.println(mid);
	}*/
	
	public <T> T middleElement(T[] arr) {
		
		return arr[arr.length/2];
		
	}

}
