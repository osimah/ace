package com.sape.generic.program;

public class PrintSequence implements Runnable {

	static Object mutex = new Object();
	static int count;
	int remainder;
	String threadName;
	String seq;
	public PrintSequence(int remainder, String threadName, String seq) {
		this.remainder = remainder;
		this.threadName = threadName;
		this.seq = seq;
	}
	
	@Override
	public void run() {
		while(count < 10) {
			synchronized (mutex) {
				while(count % 3 != remainder) {
					try {
						mutex.wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.println( threadName + " printing " + seq);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count++;
				mutex.notifyAll();
			}
		}
		
	}

}
