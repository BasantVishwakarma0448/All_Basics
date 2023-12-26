package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceExample {

	public static void main(String[] args) {

		// List a = new ArrayList<>();

		// List a = new LinkedList<>();

		// List a = new Stack<>();

		// List a = new Vector<>();

		Vector a = new Stack<>();

		a.add(1);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(6);
		a.add(6);
		a.add(5);

		System.out.println(a);

		a.add(1, "Ram");

		System.out.println(a);

		a.set(3, "Shyam");

		System.out.println(a);

		System.out.println(a.subList(3, 6));
		System.out.println(a.indexOf(6));
		System.out.println(a.lastIndexOf(6));

		Iterator it = a.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
