package com.xbs.main;

import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class ThreadPoolExecutorTest {
	public static void main(String[] args) {
		ThreadPoolExecutor threadPool = null;
		try {
			threadPool = new ThreadPoolExecutor(1, 1, 100, TimeUnit.NANOSECONDS,
					new LinkedBlockingQueue<Runnable>());
			// FIXME fixedThreadPool = Executors.newFixedThreadPool(3);
			for (int i = 0; i < 10; i++) {
				final int index = i;
				threadPool.execute(new Runnable() {
					public void run() {
						try {
							System.out.println(index);
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				});
			}
		} finally {
			if (threadPool != null) {
				threadPool.shutdown();
				try {
					threadPool.awaitTermination(100, TimeUnit.NANOSECONDS);
				} catch (InterruptedException e) {
					threadPool.shutdownNow();
				}
			}
		}
	}
}