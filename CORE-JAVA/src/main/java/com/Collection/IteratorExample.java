package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List l = new ArrayList<>();

		l.add(101);
		l.add("Basant");
		l.add("Vishwakarma");
		l.add("Indore");

		Iterator it = l.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
