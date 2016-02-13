package com.vishal.wait.notify;


public class WaitNotifyExample {
	
	//private CountDownLatch countDownLatch = new CountDownLatch(3);
	private static boolean isReleased = true;

	public static void main(String[] args) {

		Thread runnable1 = new Thread("Yahoo") {

			@Override
			public void run() {
				System.out.println("Yahoo better than Alibaba");
				new WaitNotifyExample().doSomething("PINK");

			}
		};


		Thread runnable2 = new Thread("Google") {
			@Override
			public void run() {
				System.out.println("Google is better than Yahoo!");
				new WaitNotifyExample().doSomething("PURPLE");
				notify();
			}
		};

		runnable1.start();
		runnable2.start();

	}

	public void doSomething(String color) {
		//countDownLatch.countDown();
		FRUITS apple = FRUITS.APPLE;
		synchronized (apple) {
			while(isReleased) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			apple.setColor(color);
			System.out.println("Color of Apple is " + apple.getColor());
		}

	}

}
