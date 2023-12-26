package com.NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private static void talk(Socket client) throws IOException {
		PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

		String msg = null;
		msg = br.readLine();

		while (msg != null) {
			System.out.println("Server Received " + msg);
			pw.println(msg + " " + msg);
			if (msg.equals("Bye")) {
				msg = br.readLine();
			}
		}

		pw.close();
		br.close();
		client.close();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Echo Server Started");
		ServerSocket ss = new ServerSocket(2222);

		Socket client = null;
		boolean flag = true;

		while (flag) {
			client = ss.accept();
			talk(client);
		}
		System.out.println("Echo Server Stopped");
		ss.close();
	}
}
