package com.NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket echoSocket = new Socket("127.0.0.1", 2223);

		PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
		BufferedReader br = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		String userInput = stdIn.readLine();

		while (userInput != null) {
			out.println(userInput);
			System.out.println("Echo Client " + br.readLine());
			if (userInput.equals("Bye")) {
				break;
			}

			userInput = stdIn.readLine();
		}

		echoSocket.close();
	}
}
