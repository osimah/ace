package com.sape.generic.program;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		
		List<Double> db = new ArrayList<>();
		
		List list = new ArrayList<String>();
		list.add(2);
		//list.add(3.40);
		list.add("osim");
		for(int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof String) {
				String name = (String) list.get(i);
				System.out.println(name);
				
			}
			if (list.get(i) instanceof Integer) {
				Integer new_name = (Integer) list.get(i);
				System.out.println(new_name);
				
			}
		}
		/*for(String abs : list) {
			System.out.println(abs);
		}*/
		System.out.println(list);
	}

}
