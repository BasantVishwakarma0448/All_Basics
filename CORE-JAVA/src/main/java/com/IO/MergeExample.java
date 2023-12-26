package com.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeExample {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("D:\\BOne.txt"));
		PrintWriter pw = new PrintWriter("D:\\One.txt");

		String s = br.readLine();

		while (s != null) {
			pw.write(s);
			s = br.readLine();
		}
		br.close();

		br = new BufferedReader(new FileReader("D:\\MergeOne.txt"));

		String str = br.readLine();

		while (str != null) {
			pw.write(str);
			str = br.readLine();
		}
		System.out.println("Completed........");
		br.close();
		pw.close();

	}

}
