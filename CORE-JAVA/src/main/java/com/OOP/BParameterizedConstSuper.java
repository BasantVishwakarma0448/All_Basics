package com.OOP;

//This class is related to Explicit/implicit Example(super)
public class BParameterizedConstSuper extends AParameterizedConstSuper {
	private String surname;

	public BParameterizedConstSuper() {
		System.out.println("This Is default of B.....");
	}

	public BParameterizedConstSuper(String surname) {
		// super();
		super("Basant");
		this.surname = surname;
		System.out.println("This SurName from B......." + surname);
	}
}
