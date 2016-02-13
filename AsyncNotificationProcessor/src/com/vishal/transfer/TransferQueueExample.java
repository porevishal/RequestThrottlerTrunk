package com.vishal.transfer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample {

	public static void main(String[] args) throws InterruptedException {
		
		final List<String> list = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12");
		
		final TransferQueue<String> transferQueue = new LinkedTransferQueue<String>(list);
		
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					transferQueue.put("13");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		Thread consumer1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String take;
				try {
					take = transferQueue.take();
					System.out.println(take + " "+Thread.currentThread());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread consumer2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String take;
				try {
					take = transferQueue.take();
					System.out.println(take + " "+Thread.currentThread());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});

		
		producer.start();
		consumer1.start();consumer2.start();
		
		
		
		
		
	}

}
