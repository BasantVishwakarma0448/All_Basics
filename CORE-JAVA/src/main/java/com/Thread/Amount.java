package com.Thread;

public class Amount {
	private double balance;

	public double getBalance() {
		delay();
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public synchronized void deposit(String msg, double amount) {
		double bal = getBalance() + amount;
		setBalance(bal);
		System.out.println(msg + " New Balance = " + bal);
	}

	private void delay() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
