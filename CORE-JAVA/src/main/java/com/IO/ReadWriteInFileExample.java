package com.IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadWriteInFileExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileWriter fw = new FileWriter("D://Three.txt");

		PrintWriter pw = new PrintWriter(fw);

		System.out.println("Enter.....");

		String sc = br.readLine();
		pw.write(sc);

		pw.close();
		fw.close();
		br.close();

	}

}
