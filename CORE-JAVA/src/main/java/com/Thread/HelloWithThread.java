package com.Thread;

//Random Output on every Execution
public class HelloWithThread extends Thread {

	String name = null;

	public HelloWithThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}
	}

	public static void main(String[] args) {
		HelloWithThread t = new HelloWithThread("Ram");
		HelloWithThread t1 = new HelloWithThread("Shyam");

		t.start();
		t1.start();

		// main method is also a thread itself
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + "In to the main method......");
		}
	}
}
