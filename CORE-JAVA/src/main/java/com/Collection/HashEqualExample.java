package com.Collection;

public class HashEqualExample {

	public static void main(String[] args) {
		String name = "Basant";
		String name1 = "Basant";
		String name2 = new String("Ram");

		if (name.equals(name1)) {
			System.out.println("Equal for Name 1");
		}
		if (name1.equals(name2)) {
			System.out.println("Equal for Name 2");
		}

		if (name == name1) {
			System.out.println("Operator Equal for Name 1");
		}
		if (name == name2) {
			System.out.println("Operator Equal for Name 2");
		} else {
			System.out.println("Operator not Equal for Name 2");
		}

		if (name.hashCode() == name1.hashCode()) {
			System.out.println("Hashcode Equal for Name 1");
		}
		if (name.hashCode() == name2.hashCode()) {
			System.out.println("Hashcode Equal for Name 2");
		}
	}

}
