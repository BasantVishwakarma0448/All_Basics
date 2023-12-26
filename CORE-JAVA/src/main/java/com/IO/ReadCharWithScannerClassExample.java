package com.IO;

import java.util.Scanner;

public class ReadCharWithScannerClassExample {

	public static void main(String[] args) {
		char ch;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any character ........");
		ch = sc.next().charAt(0);

		System.out.println(ch);

	}

}
