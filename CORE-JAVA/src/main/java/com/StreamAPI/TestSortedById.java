package com.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSortedById {

	public static void main(String[] args) {
		List<SortingById> list = new ArrayList<>();

		list.add(new SortingById(101, "Basant"));
		list.add(new SortingById(107, "Ram"));
		list.add(new SortingById(102, "Shyam"));
		list.add(new SortingById(104, "Seeta"));

		Stream<SortingById> stream = list.stream();

		// For Ascending
		stream.sorted(Comparator.comparingInt(SortingById::getId)).forEach(e -> System.out.println(e));

		// For Descending
		// stream.sorted(Comparator.comparingInt(SortingById::getId).reversed()).collect(Collectors.toList())
		// .forEach(e -> System.out.println(e));
	}

}
