package com.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringArrayTest {

	public static void main(String[] args) {
		String[] s = { "one", "two", "three", "three", "four" };

		// List<String> list = Arrays.asList("one", "two", "two", "three", "three",
		// "four");

		Stream<String> list = Arrays.stream(s);

		// list.sorted().filter(e -> e.startsWith("t")).distinct().forEach(e ->
		// System.out.println(e));
		list.sorted().map(i -> i.toUpperCase()).filter(i -> i.startsWith("T")).distinct().forEach(e -> System.out.println(e));
	}

}
