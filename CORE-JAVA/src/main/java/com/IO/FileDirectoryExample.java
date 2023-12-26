package com.IO;

import java.io.File;

public class FileDirectoryExample {

	public static void main(String[] args) {
		File directory = new File("D:\\Interview_Workspace\\CORE-JAVA\\src\\main\\java\\com\\Collection");

		File[] list = directory.listFiles();

		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				System.out.println(list[i].getName());
			}
		}

	}

}
