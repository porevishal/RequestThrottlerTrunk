package com.vishal.async.queue;

import java.net.ServerSocket;

public class MyServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(6868, 5);
			while (true) {
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
