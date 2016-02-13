package com.vishal.wait.notify;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {

		final MyData data = new MyData();

		new Thread(new Runnable() {

			@Override
			public void run() {


				synchronized (data) {

					while (data.getCount() != 100) {
						try {
							data.wait();
							System.out.println("yahoo");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (data) {
					while (true) {
						System.out.println(data.getCount());
						notifyAll();
					}
				}
			}
		}).start();
		;

	}

}
