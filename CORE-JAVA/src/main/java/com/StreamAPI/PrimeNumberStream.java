package com.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class PrimeNumberStream {

	public static boolean isPrime(int a) {
		int count = 0;

		if (a == 1) {
			return false;

		}
		for (int i = 2; i < a - 1; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		return count == 0;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 13, 56, 35, 17);

		list.stream().filter(e -> isPrime(e)).forEach(i -> System.out.println(i));
	}

}
