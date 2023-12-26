package com.Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparator {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(108, "Ashish", 78007), new Employee(102, "Basant", 86000),
				new Employee(108, "Ram", 75597));

		// Collections.sort(list, new SortByName());
		// Collections.sort(list, new SortBySalary());
		// Collections.sort(list, new SortById());
		 Collections.sort(list, new SortByIdAndNameDecsending());

		// String str = "SortByName";

		/*
		 * if (str.equals("SortByName")) { Collections.sort(list, new SortByName()); }
		 * else { Collections.sort(list, new SortBySalary()); }
		 */

		list.forEach(System.out::println);
	}
}
