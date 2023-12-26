package com.NetWorking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLWriting {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.ask.com/web");

		String question = "java";

		URLConnection urlConnection = url.openConnection();

		urlConnection.setDoOutput(true);

		OutputStreamWriter out = new OutputStreamWriter(urlConnection.getOutputStream());

		out.write("Question = " + question);
		out.close();

		InputStream inputStream = urlConnection.getInputStream();

		Scanner sc = new Scanner(inputStream);

		System.out.println("URL Connects........");

		while (sc.hasNext()) {
			String html = sc.nextLine();

			System.out.println(html);
		}
		sc.close();
	}

}
