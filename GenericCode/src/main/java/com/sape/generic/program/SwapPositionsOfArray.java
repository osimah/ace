package com.sape.generic.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SwapPositionsOfArray {

	public static void main(String[] args) {
		
		/*Integer[] arr = {1, 4, 5, 8, 0};
		String[] strArr = {"v", "x", "a", "e", "z", "t","y"};
		swapPositions(arr, 2, 3);
		swapPositions(strArr, 1, 5);*/
		HashSet set = new HashSet<>();
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		
		//LinkedHashSet<E>
	}
	
	public <T> T[] swapPositions(T[] arr, int pos1, int pos2) {
		
		System.out.println(pos1 + " and "+ pos2);
		
		int len = arr.length;
		if( len <= pos1 || len <= pos2) {
			throw new ArrayIndexOutOfBoundsException("Array index out of exception");
		}
		
		T temp = arr[pos1];
		T temp1 = arr[pos2];
		
		arr[pos1] = temp1;
		arr[pos2] = temp;
		
		return arr;
	}

}
