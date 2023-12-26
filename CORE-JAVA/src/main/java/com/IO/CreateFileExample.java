package com.IO;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("D://Creation.txt");

		if (f.createNewFile()) {
			System.out.println("Created Successfully......");
		} else {
			System.out.println("Not Created......");
		}
	}

}
