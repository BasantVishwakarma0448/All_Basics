package com.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Stack;

public class EnumerationExample {

	public static void main(String[] args) {
		Stack s = new Stack<>();

		s.add(101);
		s.add("Basant");
		s.add("Vishwakarma");
		s.add("Indore");
		s.push("Ram");

		// It gives last element of the stack and didn't remove it
		// System.out.println(s.peek());

		// It gives last element of the stack and remove it from stack
		// System.out.println(s.pop());

		// Enumeration only applies on Stack & Vector(Historical Classes)
		Enumeration e = s.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
