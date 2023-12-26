package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class CollectionInterFaceExamples {

	public static void main(String[] args) {
		// List
		Collection a = new ArrayList<>();
		// Collection a = new LinkedList<>();
		// Collection a = new Vector<>();
		// Collection a = new Stack<>();

		// Set
		// it contains only one null value
		// Collection a = new HashSet<>();
		// Collection a = new LinkedHashSet<>();

		// Queue
		// Collection a = new PriorityQueue<>();

		a.add(101);
		a.add("Basant");
		a.add("Seeta");
		a.add(null);
		a.add(null);
		a.add("Ram");

		System.out.println(a);
		System.out.println(a.contains(102));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a.remove("Basant"));
		System.out.println(a);
		System.out.println(a.getClass());
		// a.clear();
		System.out.println(a);

		Collection b = new ArrayList<>();

		b.add("Ramaesh");
		b.add(102);
		b.add("Sharma");

		b.addAll(a);
		System.out.println(b);

		Iterator it = b.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
