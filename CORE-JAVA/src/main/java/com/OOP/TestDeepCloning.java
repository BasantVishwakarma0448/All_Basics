package com.OOP;

//This class is related to Deep Cloning
public class TestDeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		AddressForDeep add = new AddressForDeep();

		add.setCity("Indore");

		EmployeeForDeep emp = new EmployeeForDeep();
		emp.setName("Basant");
		emp.setAddress(add);

		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getCity());

		AddressForDeep nadd = (AddressForDeep) add.clone();

		nadd.setCity("Sagar");

		EmployeeForDeep nemp = (EmployeeForDeep) emp.clone();
		nemp.setName("Neeraj");
		nemp.setAddress(nadd);

		System.out.println(nemp.getName());
		System.out.println(nemp.getAddress().getCity());
	}
}
