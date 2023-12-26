package com.Thread;

public class IsAliveMethod extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is alive.....");
	}

	public static void main(String[] args) {
		IsAliveMethod a = new IsAliveMethod();
		IsAliveMethod b = new IsAliveMethod();

		System.out.println(a.isAlive());

		a.start();

		System.out.println(a.isAlive());
		System.out.println(b.isAlive());

		b.start();

		System.out.println(b.isAlive());
	}

}
