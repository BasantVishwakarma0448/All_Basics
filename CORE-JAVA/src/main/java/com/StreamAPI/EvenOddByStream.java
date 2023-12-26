package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class EvenOddByStream {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(12);
		list.add(35);
		list.add(48);
		list.add(37);
		list.add(39);

		list.stream().filter(e -> (e % 2 == 0)).forEach(e -> System.out.println(e));

	}

}
