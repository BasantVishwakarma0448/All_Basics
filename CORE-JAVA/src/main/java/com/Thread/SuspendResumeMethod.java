package com.Thread;

public class SuspendResumeMethod extends Thread {
	public void run() {
		String name = currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		SuspendResumeMethod s = new SuspendResumeMethod();
		SuspendResumeMethod s1 = new SuspendResumeMethod();
		SuspendResumeMethod s2 = new SuspendResumeMethod();

		s.setName("Ram");
		s1.setName("Shyam");
		s2.setName("Seeta");

		s.start();
		s1.start();

		s1.suspend();

		s2.start();
		s1.resume();

	}

}
