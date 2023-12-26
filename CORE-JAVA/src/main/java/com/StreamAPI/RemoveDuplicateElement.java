package com.StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 12, 12, 12, 12, 13, 15, 14, 89, 12, 13, 73, 7346, 73, 73, 25, 25, 15);

		Set<Integer> set = new HashSet<>();

		list.stream().filter(e -> !set.add(e)).forEach(e -> System.out.println(e));
		System.out.println("----------------------------------------");

		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
