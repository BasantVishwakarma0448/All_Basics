package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class LargeNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 13, 2, 3, 4655, 434, 5, 67, 859, 497);

		Integer i = list.stream().max(Integer::compare).get();

		System.out.println(i);
	}

}
