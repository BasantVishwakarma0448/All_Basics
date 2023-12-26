package com.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fsi = new FileInputStream("D:\\Images pro\\Basant Vishwakarma.png");
		FileOutputStream fso = new FileOutputStream("D:\\basant.png");

		int i = fsi.read();

		while (i != -1) {
			fso.write(i);

			i = fsi.read();
		}
		fso.close();
		fsi.close();
		System.out.println("Completed........");
	}

}
