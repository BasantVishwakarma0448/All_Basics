package com.Thread;

public class SleepThreadB {

	public static void main(String[] args) throws InterruptedException {
		SleepThreadA a = new SleepThreadA();

		a.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("B for Ball");
			Thread.sleep(1000);
		}
	}

}
