package com.Collection;

import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack s = new Stack();

		for (char a = 'a'; a <= 'z'; a++) {
			s.push(a);
		}

		System.out.println(s);

		Stack s1 = new Stack<>();
		while (!s.isEmpty()) {
			s1.push(s.pop());
		}

		System.out.println(s1);

		Stack s2 = new Stack();

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		System.out.println(s2);
	}

}
