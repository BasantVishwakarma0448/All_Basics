package com.OOP;

//This class is Related to Deep cloning 
public class AddressForDeep implements Cloneable {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
