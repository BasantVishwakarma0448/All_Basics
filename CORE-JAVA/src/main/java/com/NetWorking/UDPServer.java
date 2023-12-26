package com.NetWorking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		String[] quotes = { "Bura mat dekho", "Bura mat suno", "Bura mat bolo" };
		DatagramSocket socket = new DatagramSocket(2224);

		byte[] buf = new byte[256];

		DatagramPacket packet = new DatagramPacket(buf, buf.length);

		boolean flag = true;

		while (flag) {
			socket.receive(packet);
			InetAddress address = packet.getAddress();
			int port = packet.getPort();

			int ind = (int) (Math.random() * 2);

			byte[] quote = quotes[ind].getBytes();

			DatagramPacket quotePk = new DatagramPacket(quote, quote.length, address, port);

			socket.send(quotePk);
		}
		socket.close();
	}

}
