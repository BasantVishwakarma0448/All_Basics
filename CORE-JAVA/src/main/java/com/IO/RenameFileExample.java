package com.IO;

import java.io.File;

public class RenameFileExample {

	public static void main(String[] args) {
		File f = new File("D://Seeta.txt");
		File nf = new File("D://Ram.txt");
		
		
		if(f.exists()) {
			f.renameTo(nf);
			System.out.println("Completed......");
		}else {
			System.out.println("File does not exists.........");
		}

	}

}
