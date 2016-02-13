package demo;

public class SleepJoinInterrupt {

	public static void main(String[] args) throws InterruptedException {

		final Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("My name is t1 "+Thread.currentThread().getName());

			}
		});

		final Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				t1.interrupt();
				try {
					t1.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//t1.join();
				System.out.println("My name is t2 "+Thread.currentThread().getName());
			}
		});
		
		
		
		t2.start();
		//Thread.sleep(1000);
		t1.start();
		

	}

}
