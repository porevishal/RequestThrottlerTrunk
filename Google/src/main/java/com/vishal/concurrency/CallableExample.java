package com.vishal.concurrency;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<Boolean>{

	@Override
	public Boolean call() throws Exception {
		return true;
	}

}
