package com.IO;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D://One.txt");
		int i = fis.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fis.read();
		}
		fis.close();
	}

}
