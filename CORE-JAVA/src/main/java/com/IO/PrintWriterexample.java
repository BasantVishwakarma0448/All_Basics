package com.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterexample {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("D:/PrintWriterExample.txt"));
		
		pw.write("This is first line");
		System.out.println("Completed");
		pw.close();

	}

}
