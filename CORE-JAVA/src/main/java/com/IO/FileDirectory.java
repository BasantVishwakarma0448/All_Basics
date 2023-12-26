package com.IO;

import java.io.File;

public class FileDirectory {

	public static void main(String[] args) {
		File f = new File("D:\\Interview_Workspace");

		String[] list = f.list();

		for (int i = 0; i < list.length; i++) {
			System.out.println("Files = " + list[i]);
		}

	}

}
