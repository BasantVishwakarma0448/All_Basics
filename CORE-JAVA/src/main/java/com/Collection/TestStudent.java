package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		// List<Student> list = Arrays.asList(new Student(101, "Basant"), new
		// Student(108, "Ram"));

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Basant"));
		list.add(new Student(100, "Ram"));
		list.add(new Student(102, "Seeta"));
		Collections.sort(list);

		list.forEach(System.out::println);

	}

}
