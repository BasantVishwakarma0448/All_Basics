package com.NetWorking;

import java.io.*;
import java.net.*;

public class MyServer {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(1234);
			Socket client = server.accept();

			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());

			String line = in.readLine();
			out.writeBytes("Hello Client\n");
			System.out.println(line);
			client.close();
		} catch (

		Exception e) {
			System.out.println(e);
		}
	}
}
