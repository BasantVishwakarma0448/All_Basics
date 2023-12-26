package com.IO;

import java.io.File;
import java.util.Date;

public class FileInformationExample {

	public static void main(String[] args) {
		File f = new File("D://One.txt");

		if (f.exists()) {
			// Name of the File
			System.out.println("FileName = " + f.getName());

			// Original Path of the file
			System.out.println("Path of the File = " + f.getAbsolutePath());

			// check access permission
			System.out.println("Is file readable = " + f.canRead());
			System.out.println("Is file writable = " + f.canWrite());

			// check if it is directory or file
			System.out.println("Is File = " + f.isFile());
			System.out.println("Is Directory = " + f.isDirectory());

			Date d = new Date(f.lastModified());
			System.out.println("Last Modified at = " + d);

			// Length of the file
			System.out.println("File Size " + f.length() + " Bytes");

		} else {
			System.out.println("File is not present........");
		}

	}

}
