package com.Thread;

public class PriorityThread extends Thread {

	public PriorityThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + " Priority = " + getPriority());
		}
	}

	public static void main(String[] args) {

		// creates the thread
		PriorityThread a = new PriorityThread("First");
		PriorityThread b = new PriorityThread("Second");
		PriorityThread c = new PriorityThread("Third");

		// Set the priority of the thread
		a.setPriority(10);
		b.setPriority(1);
		// by default the priority of thread Third is norm_priority that is 5

		// Starting the threads
		a.start();
		b.start();
		c.start();

	}

}
