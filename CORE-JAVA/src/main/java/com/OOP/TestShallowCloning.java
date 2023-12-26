package com.OOP;

//This class is related to Shallow Cloning with employee 2
public class TestShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee();

		e.setName("Basant");
		e.setAddress("Sagar");

		System.out.println(e.getName());
		System.out.println(e.getAddress());

		Employee emp = (Employee) e.clone();

		emp.setName("Ram");
		emp.setAddress("Ayodhya");

		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
	}

}
