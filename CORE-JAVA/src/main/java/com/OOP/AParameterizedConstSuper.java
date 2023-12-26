package com.OOP;

//This class is related to Explicit/implicit Example(super)
public class AParameterizedConstSuper {

	private String name;

	public AParameterizedConstSuper() {
		System.out.println("This is Default of A.......");
	}

	public AParameterizedConstSuper(String name) {
		this.name = name;
		System.out.println("This Name from A......." + name);
	}
}
