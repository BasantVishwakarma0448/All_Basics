package com.OOP;

//This class is Related to Deep cloning 
public class EmployeeForDeep implements Cloneable {
	private String name;
	private AddressForDeep address;

	public String getName() {
		return name;
	}

	public AddressForDeep getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(AddressForDeep address) {
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		EmployeeForDeep emp = (EmployeeForDeep)super.clone();
		emp.address = (AddressForDeep)address.clone();
		return emp;
		
	}
}
