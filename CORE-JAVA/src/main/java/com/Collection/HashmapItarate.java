package com.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapItarate {

	public static void main(String[] args) {
		Map m = new HashMap<>();

		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");

		for (Object obj : m.entrySet()) {
			System.out.println(obj);
		}
	}

}
