package com.String;

//make class final 
public final class Immutable {

	// make attributes final and private
	private final String name;
	private final int age;

	// make parameterized constructor so child can not be instantiate
	public Immutable(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// getter methods to fetch the attributes
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Immutable im = new Immutable(78, "Basant");
		System.out.println("Age " + im.getAge());
		System.out.println("Name " + im.getName());
	}

}
