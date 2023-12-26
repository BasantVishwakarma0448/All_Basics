package com.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LotaryStreamExampleTest {

	public static void main(String[] args) {
		List<LotaryStreamExample> list = new ArrayList<LotaryStreamExample>();

		list.add(new LotaryStreamExample("9911001121", "Ram"));
		list.add(new LotaryStreamExample("9911001126", "Seeta"));
		list.add(new LotaryStreamExample("9911001123", "Shyam"));
		list.add(new LotaryStreamExample("9911001124", "Radha"));
		list.add(new LotaryStreamExample("9911001125", "Basant"));
		list.add(new LotaryStreamExample("9911001129", "Kumar"));

		list.stream().map(e -> e.getNo())
				// .map(e -> e.getName())
				.filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(1).forEach(e -> System.out.println(e));
	}

}
