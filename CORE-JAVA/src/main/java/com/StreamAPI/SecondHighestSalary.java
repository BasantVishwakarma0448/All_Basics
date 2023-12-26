package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestSalary {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//
//		list.add(200000);
//		list.add(10000);
//		list.add(180000);
//		list.add(30000);
//		list.add(230000);

		List<Integer> list = Arrays.asList(200000, 100000, 2320000, 1038839, 3485855);

		list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(e -> System.out.println(e));

		
	}

}
