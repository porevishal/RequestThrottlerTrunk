package com.vishal.threadserialize;


public class ThreadSerializer {
	

	public static void main(String[] args) {
		
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		Worker w3 = new Worker();
		
		w1.setNextWorker(w2);
		w2.setNextWorker(w3);
		w3.setNextWorker(w1);
		
		try {
			w1.getQueue().put(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Thread t1 = new Thread(w1, "T1");
		Thread t2 = new Thread(w2, "T2");
		Thread t3 = new Thread(w3, "T3");
		
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
