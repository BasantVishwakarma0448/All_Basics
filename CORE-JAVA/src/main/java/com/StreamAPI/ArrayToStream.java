package com.StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		String[] s = { "Ram", "Seeta", "Laxman", "Basudev" };

		Stream st = Arrays.stream(s);

		st.forEach(i -> System.out.println(i));

		// st.forEach(System.out::println);

		// st.sorted().forEach(System.out::println);

		// st.sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
