package com.Thread;

public class DaemonThread extends Thread {
	@Override
	public void run() {
		System.out.println("Daemon Thread...." + currentThread().isDaemon());
		while (true) {
			try {
				Thread.sleep(200);
				System.out.println("Daemon Thread Waked up......");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		DaemonThread d = new DaemonThread();

		//d.setDaemon(true);
		d.start();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Leaving main mehtod.....");
		System.out.println("Exit from JVM.....");
	}
}
