package com.Collection;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		super();

		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// return o.rollNo - this.rollNo; //For Descending

		// return this.name.compareTo(o.name);

		if (this.rollNo - o.rollNo == 0) {
			return 0;
		}
		return this.rollNo - o.rollNo; // For Ascending
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}
