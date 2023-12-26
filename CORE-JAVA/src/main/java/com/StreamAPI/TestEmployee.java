package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(16, "Shyam"));
		list.add(new Employee(19, "Rajkumar"));
		list.add(new Employee(15, "Ram"));
		list.add(new Employee(20, "Seeta"));
		list.add(new Employee(30, "Radha"));

		list.stream().filter(e -> e.getAge() < 18).forEach(e -> System.out.println(e));

	}

}
