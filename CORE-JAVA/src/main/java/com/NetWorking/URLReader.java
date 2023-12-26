package com.NetWorking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

	public static void main(String[] args) throws IOException {
		URL u = new URL("http://www.sunilos.com:80/Home");

		System.out.println("Protocol : " + u.getProtocol());
		System.out.println("Host Name : " + u.getHost());
		System.out.println("Port Number : " + u.getPort());
		// If port number is not specified it returns -1
		System.out.println("File Name : " + u.getFile());

		InputStream inStr = u.openStream();
		Scanner sc = new Scanner(inStr);

		while (sc.hasNext()) {
			String html = sc.nextLine();
			System.out.println(html);
		}
		sc.close();

	}

}
