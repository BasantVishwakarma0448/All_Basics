package com.Thread;

//Random Output on every Execution 
public class HelloWithRunnable implements Runnable {

	String name = null;

	public HelloWithRunnable(String name) {
		//super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}

	}

	public static void main(String[] args) {
		Thread h = new Thread(new HelloWithRunnable("Ram"));
		Thread h1 = new Thread(new HelloWithRunnable("Seeta"));

		h.start();
		h1.start();

	}
}
