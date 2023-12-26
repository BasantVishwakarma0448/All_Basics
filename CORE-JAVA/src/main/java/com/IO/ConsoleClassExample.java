package com.IO;

import java.io.Console;

public class ConsoleClassExample {

	public static void main(String[] args) {
		String username;
		char[] password;
		Console cs = System.console();

		System.out.println("Enter Username : ");
		username = cs.readLine();

		System.out.println("Enter Password : ");
		password = cs.readPassword();

		String a = String.valueOf(password);

		System.out.println("Username = " + username);
		System.out.println("Password = " + password);
		System.out.println("Password = " + a);

	}

}
