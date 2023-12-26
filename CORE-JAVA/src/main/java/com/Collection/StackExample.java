package com.Collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		// LIFO- Last Come First Out
		Stack s = new Stack<>();

		s.push("Ram");
		s.push("Seeta");
		s.push("Bharat");
		s.push("Laxman");
		s.push("Shyam");
		s.push("Radha");

		System.out.println(s);

		// It only shows the elements from the list
		String a = (String) s.peek();

		// It removes the elements from the list
		String b = (String) s.pop();

		String c = (String) s.pop();
		String d = (String) s.pop();
		String e = (String) s.pop();
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);

		Stack s1 = new Stack();

		s1.push(b);
		s1.push(c);
		s1.push(d);
		s1.push(e);

		System.out.println(s1);

	}

}
