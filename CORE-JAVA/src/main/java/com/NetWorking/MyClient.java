package com.NetWorking;

import java.net.*;
import java.io.*;

public class MyClient {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		try {
			Socket client = new Socket("localhost", 1234);

			DataInputStream in = new DataInputStream(client.getInputStream());
			DataOutputStream out = new DataOutputStream(client.getOutputStream());

			out.writeBytes("Hello Server\n");
			String line = in.readLine();
			client.close();
		} catch (

		Exception e) {
			System.out.println(e);
		}
	}
}
