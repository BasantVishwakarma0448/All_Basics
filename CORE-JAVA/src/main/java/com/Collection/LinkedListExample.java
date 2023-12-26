package com.Collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();

		list.add("Ram");
		list.add("Seeta");
		list.add("Shyam");
		list.add(null);
		list.add(null);

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("Ram"));
		System.out.println(list.size());
		System.out.println(list.getClass());

		System.out.println(list);
	}

}
