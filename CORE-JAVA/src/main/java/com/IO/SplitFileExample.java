package com.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitFileExample {

	public static void main(String[] args) throws IOException {
		String s = "D://Split.txt";
		int count = 0;
		int nol = 2;
		File f = new File(s);
		Scanner sc = new Scanner(f);

		while (sc.hasNext()) {
			sc.nextLine();
			count++;
		}
		System.out.println("No of Lines ===== " + count);

		// No of Files
		int temp = count / nol;
		int rem = count % nol;
		int nof = 0;
		if (temp != 0) {
			nof = temp;

			if (rem != 0) {
				nof++;
			} else {
				nof = temp;
			}
		}

		System.out.println("No of File ===== " + nof);

		BufferedReader br = new BufferedReader(new FileReader(s));

		String str;
//		for (int k = 1; k < br.read(); k++) {
//
//			str = br.readLine();
//			System.out.println(k + " " + str);
//		}

		for (int j = 1; j <= nof; j++) {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D://split//AfterSplit" + j + ".txt"));
			str = br.readLine();
			System.out.println(str);
			for (int i = 1; i <= nol; i++) {
				if (str != null) {
					bw.write(str);
					str = br.readLine();
					System.out.println("Complete.........");
					if (i != nol) {
						bw.newLine();
					}
				}
			}
			bw.close();
		}
		br.close();

	}

}
