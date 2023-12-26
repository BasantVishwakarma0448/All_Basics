package com.IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D://One.txt");

		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		file.close();

	}

}
