package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class RetainAllExample {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("Bag");
		a.add("Pen");

		List<String> b = new ArrayList<String>();
		b.add("Bag");
		b.add("Book");

		b.retainAll(a);

		System.out.println(b);

	}

}
