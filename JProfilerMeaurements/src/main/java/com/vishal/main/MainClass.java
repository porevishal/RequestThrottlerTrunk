package com.vishal.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.timer.VishalExecutors;

public class MainClass {

	public static void main(String[] args) {

		final ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring-beans.xml");

		VishalExecutors bean = (VishalExecutors) appContext
				.getBean("executorService");
		bean.createThreads();

		Runtime.getRuntime().addShutdownHook(new Thread() {

			@Override
			public void run() {
				System.out.println("Shutting Down Application Context");
				appContext.close();
				System.out.println("Closed Application Context");
			}
		});

		while (true) {
			System.out.println("My name is RAM");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
