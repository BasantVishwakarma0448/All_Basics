package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();

		a.add("Ram");
		a.add("1");
		a.add("Shyam");
		a.add("Seeta");
		a.add("Radha");
		a.add("Ravindra");

		System.out.println(a);

		List<String> b = new ArrayList<String>();
		b.add("Ram");
		b.add("1");
		b.add("Shyam");
		b.add("Seeta");
		b.add("Radha");
		b.add("Ravindra");
		b.add("Lakshman");
		b.add("Bharat");
		b.add("Shri");

		System.out.println(b);

		// It shows the common objects from the two lists
		a.retainAll(b);

		System.out.println(a);

	}

}
