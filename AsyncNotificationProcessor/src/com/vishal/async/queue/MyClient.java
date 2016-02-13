package com.vishal.async.queue;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket[] clients = new Socket[8];
		for (int i = 0; i < 6; i++) {
			clients[i] = new Socket("175.27.3.4", 6868);
			System.out.printf("Client %2d: " + clients[i] + "%n", i);
			//clients[i].close();
		}
		for (int i = 6; i < 10; i++) {
			clients[i] = new Socket("175.27.3.4", 2123);
			System.out.printf("Client %2d: " + clients[i] + "%n", i);
			//clients[i].close();
		}
	}
}