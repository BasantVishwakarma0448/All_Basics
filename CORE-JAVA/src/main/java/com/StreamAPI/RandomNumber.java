package com.StreamAPI;

import java.util.stream.Stream;

public class RandomNumber {

	public static void main(String[] args) {
		Stream.generate(Math::random).limit(10)
				.forEach(e -> System.out.println(e * 1000));

	}

}
