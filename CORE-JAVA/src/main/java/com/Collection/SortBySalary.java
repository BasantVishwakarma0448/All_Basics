package com.Collection;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getSalary() == o2.getSalary()) {
			return 0;
		} else if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}
