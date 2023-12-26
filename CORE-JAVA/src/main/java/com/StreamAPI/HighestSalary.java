package com.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestSalary {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(20000);
		list.add(90000);
		list.add(45000);
		list.add(20030);
		list.add(30000);

		list.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(e -> System.out.println(e));

	}

}
