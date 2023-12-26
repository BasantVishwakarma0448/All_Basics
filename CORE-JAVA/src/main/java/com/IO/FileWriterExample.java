package com.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D://One.txt");
		fw.write("Basant Vishwakarma");
		System.out.println("File Modified Successfully.........");
		fw.close();

	}

}
