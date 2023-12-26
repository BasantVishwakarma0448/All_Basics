package com.Collection;

public class TestEqualAndHashExample {

	public static void main(String[] args) {
		EqualAndHashExample e = new EqualAndHashExample(101, "Basant", 20000);
		EqualAndHashExample e1 = new EqualAndHashExample(101, "Ram", 20034);

		if (e.equals(e1)) {
			System.out.println("Both objects are Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

}
