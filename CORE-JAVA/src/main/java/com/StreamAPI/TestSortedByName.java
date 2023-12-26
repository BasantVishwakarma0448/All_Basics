package com.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestSortedByName {

	public static void main(String[] args) {
		List<SortingByName> list = new ArrayList<>();

		list.add(new SortingByName("Basant", 23));
		list.add(new SortingByName("Ram", 27));
		list.add(new SortingByName("Ankit", 54));
		list.add(new SortingByName("Sanket", 35));
		list.add(new SortingByName("Abhishek", 24));

		Stream<SortingByName> stream = list.stream();

		// For Ascending
		stream.sorted(Comparator.comparing(SortingByName::getName)).forEach(e -> System.out.println(e));

		// For Descending
		stream.sorted(Comparator.comparing(SortingByName::getName).reversed()).forEach(e -> System.out.println(e));
	}

}
