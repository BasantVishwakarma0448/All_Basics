package com.Thread;

public class JoinMethod extends Thread {
	@Override
	public void run() {
		String name = currentThread().getName();

		for (int i = 0; i <= 3; i++) {

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		JoinMethod a = new JoinMethod();
		JoinMethod b = new JoinMethod();
		JoinMethod c = new JoinMethod();

		a.setName("Ram");
		b.setName("Shyam");
		c.setName("Raghav");

		a.start();
		b.start();

//		try {
//			b.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		c.start();
	}

}
