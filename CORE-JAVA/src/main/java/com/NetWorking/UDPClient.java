package com.NetWorking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket();

		byte[] buf = new byte[256];

		InetAddress address = InetAddress.getByName("localhost");

		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 2224);

		socket.send(packet);

		packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		String received = new String(packet.getData());
		System.out.println("Quote of the Moment " + received);

		socket.close();
	}

}
