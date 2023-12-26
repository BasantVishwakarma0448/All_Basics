package com.Thread;

public class RacingCondition extends Thread {
	public static Amount a = new Amount();

	public RacingCondition(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			a.deposit(getName(), 1000);
		}
	}

}
