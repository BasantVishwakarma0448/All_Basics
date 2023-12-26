package com.Thread;

public class TestRacing {

	public static void main(String[] args) {
		RacingCondition r = new RacingCondition("Rama");
		RacingCondition a = new RacingCondition("Shyama");

		r.start();
		a.start();

	}

}
