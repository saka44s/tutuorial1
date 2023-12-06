package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/* Types of ThreadPools/Concurrency API Executors
 * ExecutorService
 * Executors
 * ThreadPoolExecutor
 * 
 * Java thread pool manages the collection of Runnable threads
*/
public class ThreadRunnableExec {
	public static void main(String a[]) {
		//SingleThreadExec();
		MultiThreadExec();
	}
	
	
	public static void SingleThreadExec() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		});
	}
	
	public static void MultiThreadExec() {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		/*
		 * submit(Callable<T>) returns a Future object which allows a way for you to
		 * programatically cancel the running thread later as well as get the T that is
		 * returned when the Callable complete
		 */		
		executor.execute(() -> {
			for(int i = 0; i < 15; i++) {
			    String threadName = Thread.currentThread().getName();
			    try {
					TimeUnit.SECONDS.sleep(1);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    System.out.println("Hello " + threadName);
			}

		});
		/*
		 * for (int i = 0; i < 10; i++) { Runnable worker = new WorkerThread("" + i);
		 * executor.execute(worker); }
		 */
		executor.shutdown();
		
		while (!executor.isTerminated()) {}
        System.out.println("Finished all threads");
	}
}
