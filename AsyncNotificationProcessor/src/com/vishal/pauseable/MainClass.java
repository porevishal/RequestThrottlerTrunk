package com.vishal.pauseable;

public class MainClass {

	private static PausableThreadPoolExecutor pausableThreadPoolExecutor = new PausableThreadPoolExecutor();

	public static void main(String[] args) {

		pausableThreadPoolExecutor.submit(new Runnable() {

			@Override
			public void run() {
				int i=0;
				while (i<=20) {
					System.out.println("Core 1 -->"+i++
							+ Thread.currentThread().getName());
					/*System.out.println("Current Queue Count "
							+ pausableThreadPoolExecutor.getQueue().size());*/
					//i++;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		pausableThreadPoolExecutor.submit(new Runnable() {

			@Override
			public void run() {
				int i=0;
				while (i<=50) {
					System.out.println("Core 2 -->"+i++
							+ Thread.currentThread().getName());
					System.out.println("Current Queue Count "
							+ pausableThreadPoolExecutor.getQueue().size());
					//i++;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});

		pausableThreadPoolExecutor.submit(new Runnable() {

			@Override
			public void run() {
				//while (true) {
					System.out.println("Core 3"
							+ Thread.currentThread().getName());
					System.out.println("Current Queue Count "
							+ pausableThreadPoolExecutor.getQueue().size());
					System.out.println("Current Queue Count "
							+ pausableThreadPoolExecutor.getQueue().size());
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			//}
		});

		pausableThreadPoolExecutor.submit(new Runnable() {

			@Override
			public void run() {
				//while (true) {
					System.out.println("Core 4"
							+ Thread.currentThread().getName());
					System.out.println("Current Queue Count "
							+ pausableThreadPoolExecutor.getQueue().size());
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				//}

			}
		});

		pausableThreadPoolExecutor.pause();

		pausableThreadPoolExecutor.submit(new Runnable() {

			@Override
			public void run() {
				//while (true) {
					System.out.println("Core 5"
							+ Thread.currentThread().getName());
					System.out.println("Current Queue Count "
							+ pausableThreadPoolExecutor.getQueue().size());
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			//}
		});

		pausableThreadPoolExecutor.submit(new Runnable() {

			@Override
			public void run() {
				//while (true) {
					System.out.println("Core 6"
							+ Thread.currentThread().getName());
					System.out.println("Current Queue Count "
							+ pausableThreadPoolExecutor.getQueue().size());
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			//}
		});
		
		pausableThreadPoolExecutor.resume();
	}
	
}
