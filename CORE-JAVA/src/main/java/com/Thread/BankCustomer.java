package com.Thread;

public class BankCustomer {

	public static void main(String[] args) {
		Bank bank = new Bank(400);

		Thread t1 = new Thread(bank);
		Thread t2 = new Thread(bank);

		t1.setName("Ram");
		t2.setName("Shyam");

		t1.start();
		t2.start();

		Bank bank2 = new Bank(1100);

		Thread t3 = new Thread(bank2);
		Thread t4 = new Thread(bank2);

		t3.setName("Radha");
		t4.setName("Seeta");

		t3.start();
		t4.start();

	}

}
