package com.solutionmaker.throttler;

/*
 * http://download.java.net/jdk7/archive/b123/docs/api/java/util/concurrent/ThreadPoolExecutor.html
 */
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class PausableScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor implements ExecutorRemoteControllerService{

	public PausableScheduledThreadPoolExecutor(int corePoolSize,
			ThreadFactory threadFactory, RejectedExecutionHandler handler) {
		super(corePoolSize, threadFactory, handler);
		// TODO Auto-generated constructor stub
	}

	public PausableScheduledThreadPoolExecutor(int corePoolSize,
			ThreadFactory threadFactory) {
		super(corePoolSize, threadFactory);
		// TODO Auto-generated constructor stub
	}

	public PausableScheduledThreadPoolExecutor(int corePoolSize,
			RejectedExecutionHandler handler) {
		super(corePoolSize, handler);
		// TODO Auto-generated constructor stub
	}

	public PausableScheduledThreadPoolExecutor(int corePoolSize) {
		super(corePoolSize);
	}
	
	

	private boolean isPaused;
	private ReentrantLock pauseLock = new ReentrantLock();
	private Condition unpaused = pauseLock.newCondition();


	@Override
	protected void beforeExecute(Thread t, Runnable r) {
		super.beforeExecute(t, r);
		pauseLock.lock();
		try {
			while (isPaused)
				unpaused.await();
		} catch (InterruptedException ie) {
			t.interrupt();
		} finally {
			pauseLock.unlock();
		}
	}

	@Override
	public void pause() {
		pauseLock.lock();
		try {
			isPaused = true;
		} finally {
			pauseLock.unlock();
		}
	}

	@Override
	public void resume() {
		pauseLock.lock();
		try {
			isPaused = false;
			unpaused.signalAll();
		} finally {
			pauseLock.unlock();
		}
	}
}
