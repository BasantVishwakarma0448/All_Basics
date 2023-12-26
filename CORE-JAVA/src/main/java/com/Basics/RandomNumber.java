package com.Basics;

public class RandomNumber {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			int random =  (int) (Math.random()*100);

			System.out.println("The Random number is " + random);
		}
	}

}
