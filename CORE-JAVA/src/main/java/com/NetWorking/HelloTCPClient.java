package com.NetWorking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HelloTCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket client = new Socket("localhost", 2222);
		Scanner in = new Scanner(System.in);

		PrintWriter pw = new PrintWriter(client.getOutputStream());
		pw.println("Hello TCP Server");

		String greeting = in.nextLine();

		System.out.println(greeting);

		client.close();

	}

}
