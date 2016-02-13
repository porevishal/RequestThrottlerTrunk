package com.solutionmaker.throttler;

public interface ExecutorRemoteControllerService {
	
	/**
	 * Pauses the execution of next job
	 */
	public void pause();
	
	/**
	 * Resumes the execution of jobs
	 */
	public void resume();
}
