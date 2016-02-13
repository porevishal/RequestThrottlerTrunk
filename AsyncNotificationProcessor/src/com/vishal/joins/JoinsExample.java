package com.vishal.joins;

public class JoinsExample {
	
	private volatile static int i = 0;
	
	private static Thread threadOne = new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("This is thread 1");
			
			while(i <= 7) {
				try {
					i = i +1;
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+ " "+Thread.currentThread());
			}
			
		}
	}, "Yahoo");
	
	private static Thread threadTWO = new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("This is thread 2");
			
			while(i <= 15) {
				try {
					i = i +1;
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+ " "+Thread.currentThread());
			}
			
		}
	}, "Google");

	public static void main(String[] args) throws InterruptedException {
		
		threadOne.start();
		threadOne.join();
		threadTWO.start();

	}

}
