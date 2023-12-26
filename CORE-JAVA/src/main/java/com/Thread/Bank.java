package com.Thread;

public class Bank extends Thread {
	static int balance = 5000;
	static int withdraw;

	public Bank(int withdraw) {
		this.withdraw = withdraw;
	}

	public static synchronized void withdraw() {
		String name = currentThread().getName();
		if (withdraw <= balance) {
			System.out.println(name + " Withdraw money......");
			balance = balance - withdraw;
			System.out.println("Balance After  " + name + " Withdrawl = " + balance);
		} else {
			System.out.println("Insufficient fund.......");
		}
	}

	@Override
	public void run() {
		withdraw();
	}
}
