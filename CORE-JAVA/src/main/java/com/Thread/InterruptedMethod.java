package com.Thread;

//Interrupt method execute a thread only once and stop the execution by calling Thread.interrupt()
public class InterruptedMethod extends Thread {
	@Override
	public void run() {
		try {

			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread is started......");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread is terminated........");
		}
	}

	public static void main(String[] args) {
		InterruptedMethod i = new InterruptedMethod();

		i.start();
		i.interrupt();
	}
}
