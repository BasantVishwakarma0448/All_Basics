package com.Thread;

public class TestTable {

	public static void main(String[] args) {
		Table table = new Table();

		Table1 table1 = new Table1(table);
		Table2 table2 = new Table2(table);

		table1.start();
		table2.start();

	}

}
