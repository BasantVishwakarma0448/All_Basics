package com.OOP;

public class TestShape {

	public static void main(String[] args) {
		Shape[] s = new Shape[2];

		/*
		 * s[0] = new Circle(); s[1] = new Rectangle();
		 */
		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);

		Circle c = (Circle) s[0];

		// c.setRadius(45);

		//System.out.println(s[0].area());
		System.out.println(c.area());

		Rectangle re = (Rectangle) s[1];

		// re.setLength(57);
		// re.setWidth(90);

		//System.out.println(s[1].area());
		System.out.println(re.area());
	}

}
