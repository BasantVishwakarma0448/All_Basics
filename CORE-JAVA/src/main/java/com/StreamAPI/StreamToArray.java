package com.StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {
		Stream s = Stream.of(1, 2, 3, 4, 6, 7, 9, 5, 4);

		Object[] o = s.toArray();

		System.out.println(Arrays.toString(o));

		for (Object obj : o) {
			System.out.println(obj);
		}
	}

}
