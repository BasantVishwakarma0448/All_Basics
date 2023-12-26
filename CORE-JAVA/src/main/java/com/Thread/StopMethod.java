package com.Thread;

public class StopMethod extends Thread {
	@Override
	public void run() {
		String name = currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		StopMethod a = new StopMethod();
		StopMethod b = new StopMethod();
		StopMethod c = new StopMethod();

		a.setName("Thread-1");
		b.setName("Thread-2");
		c.setName("Thread-3");

		a.start();
		b.start();
		b.stop();
		c.start();
	}

}
