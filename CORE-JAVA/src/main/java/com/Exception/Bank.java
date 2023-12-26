package com.Exception;

public class Bank {
	int balance = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int a) throws InsufficientBalance {
		// System.out.println("Inside Withdraw " + balance);
		balance = balance - a;
		if (balance < 2000) {
			InsufficientBalance n = new InsufficientBalance();
			throw n;
		} else {
			System.out.println(balance);
		}
	}
}
