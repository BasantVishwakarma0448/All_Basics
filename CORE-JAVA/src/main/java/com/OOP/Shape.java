package com.OOP;

public class Shape {

	public double area() {
		return 0;
	}
	
	public static Shape getShape(int i) {
		if(i==1) {
			return new Circle(5);
		}
		else if(i==2){
			return new Rectangle(40, 20);
		}
		return new Shape();
	}
}
