package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataFromOneToAnotherFIle {

	public static void main(String[] args) throws IOException {
		FileInputStream fsi = new FileInputStream("D://One.txt");
		FileOutputStream fso = new FileOutputStream("D://Two.txt");

		int i;
		while ((i = fsi.read()) != -1) {
			fso.write((char) i);
		}

		System.out.println("Completed.....");

	}

}
