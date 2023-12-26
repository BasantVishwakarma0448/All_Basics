package com.Thread;

public class Table2 extends Thread {
	Table t;

	public Table2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(6);
	}
}
