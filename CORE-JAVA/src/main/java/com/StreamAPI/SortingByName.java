package com.StreamAPI;

public class SortingByName {

	private String name;
	private int age;

	public SortingByName(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "SortingByName [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
