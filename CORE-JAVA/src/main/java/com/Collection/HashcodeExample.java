package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class HashcodeExample {

	public static void main(String[] args) {
		List l = new ArrayList<>();

		l.add("Basant");
		l.add("Vishwakarma");
		l.add("Ram");

		int hashCode = l.hashCode();
		System.out.println(hashCode);
		System.out.println(l.hashCode());
	}

}
