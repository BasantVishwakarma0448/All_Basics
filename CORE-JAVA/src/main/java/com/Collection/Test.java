package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set t = new TreeSet<>();

		t.add(1);
		t.add(2);
		t.add(3);
		// t.add("Abd");
		// t.add(null);
		// t.add(null);

		System.out.println(t);

		List a = new ArrayList<>();

		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		Collections.reverse(a);
		System.out.println(a);

		Map<String, Integer> m = new HashMap<>();
		m.put("Basant", 1);
		m.put("Dheeraj", 2);
		m.put("Ram", 5);
		m.put("Seeta", 4);

		// Approach 1
		// Iterator it = m.entrySet().iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		// Approach 2
		for (Object obj : m.entrySet()) {
			System.out.println(obj);
		}

	}

}
