package com.sape.generic.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparator {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Osim", "Ahemmed", 123.00));
		list.add(new Employee("Swapan", "Kumar", 489.00));
		list.add(new Employee("Biren", "Kumar", 489.00));
		list.add(new Employee("Abram", "", 1233.00));
		list.add(new Employee("Zack", "Holland", 234.00));
		list.add(new Employee("Brajesh", "Thakur", 1267.00));
		list.add(new Employee("Bibhas", "", 2456.00));
		
		Collections.sort(list, new EmployeLastNameComparator());
		
		for(Employee e : list) {
			System.out.println(e);
		}

	}

}
