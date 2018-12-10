package com.sape.generic.program;

import java.util.Comparator;

public class EmployeLastNameComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		if(e1.getLastName().equals("") && !e2.getLastName().equals("")) {
			return 1;
		} else if(!e1.getLastName().equals("") && e2.getLastName().equals("")) {
			return -1;
		} else if(e1.getLastName().equals(e2.getLastName())) {
			return e1.getFirstName().compareTo(e2.getFirstName());
		} else {
			return e1.getLastName().compareTo(e2.getLastName());
		}
	}

}
