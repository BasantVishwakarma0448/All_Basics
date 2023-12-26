package com.NetWorking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HelloTCPServer {

	public static void main(String[] args) throws IOException {
		System.out.println("Server Started....");
		ServerSocket ss = new ServerSocket(2222);

		Socket client = ss.accept();

		System.out.println("Client Connected.....");

		Scanner sc = new Scanner(System.in);

		PrintWriter pw = new PrintWriter(client.getOutputStream());
		pw.println("Hello TCP Client....");

		String greeting = sc.nextLine();

		System.out.println(greeting);

		ss.close();

	}

}
