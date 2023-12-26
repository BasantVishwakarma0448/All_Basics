package com.Collection;

public class EqualAndHashExample {
	private int id;
	private String name;
	private int salary;

	public EqualAndHashExample() {

	}

	public EqualAndHashExample(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
		
		
		if(! (obj instanceof EqualAndHashExample))
			return false;

		EqualAndHashExample e = (EqualAndHashExample) obj;
		return this.id == e.id;
	}

	@Override
	public String toString() {
		return "EqualAndHashExample [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
