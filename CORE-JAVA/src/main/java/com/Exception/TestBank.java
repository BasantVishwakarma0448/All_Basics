package com.Exception;

public class TestBank {

	public static void main(String[] args) {
		Bank b = new Bank();

		b.setBalance(7000);

		try {
			b.withdraw(6000);
		} catch (InsufficientBalance e) {
			e.printStackTrace();
		}
	}

}
