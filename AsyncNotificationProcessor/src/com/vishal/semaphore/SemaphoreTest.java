package com.vishal.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	private static int counter = 0;
	private static Semaphore binarySemaphore = new Semaphore(1);

	private static Runnable evenRunnable = new Runnable() {

		@Override
		public void run() {

			while (counter <= 100) {
				try {
					if (counter / 2 == 0) {
						binarySemaphore.acquire();
					}
				} catch (InterruptedException e) {
					System.out.println("Error Detected");
				}

				System.out.println("Even Runnable " + counter);
				counter++;
				binarySemaphore.release();

			}

		}
	};

	private static Runnable oddRunnable = new Runnable() {

		@Override
		public void run() {
			while (counter <= 100) {
				try {
					if (counter / 2 != 0) {
						binarySemaphore.acquire();
					}
				} catch (InterruptedException e) {
					System.out.println("Error Detected");
				}

				System.out.println("Odd Runnable " + counter);
				counter++;
				binarySemaphore.release();

			}
		}
	};

	private static ExecutorService executorService = Executors
			.newFixedThreadPool(2);

	public static void main(String[] args) {

		executorService.submit(evenRunnable);
		executorService.submit(oddRunnable);
	}

}
