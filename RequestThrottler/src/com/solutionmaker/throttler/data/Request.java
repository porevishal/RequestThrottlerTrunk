package com.solutionmaker.throttler.data;

/*
 * All the jobs will need to extend this object. If the jobs are created on the same JVM, simply implementing the interace will do
 */
public interface Request<T> extends Runnable{


}
