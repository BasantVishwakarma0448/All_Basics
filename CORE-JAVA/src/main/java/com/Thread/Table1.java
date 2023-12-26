package com.Thread;

public class Table1 extends Thread {
	Table t;

	public Table1(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printTable(5);
	}
}
