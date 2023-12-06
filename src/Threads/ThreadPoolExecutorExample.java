package Threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorExample {
	public static void main(String a[]) {
		   ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		    for (int i = 0; i < 10; i++){

		      Task task = new Task("Task " + i);
		      System.out.println("A new task has been added : " + task.getName());
		      executor.execute(task);
		    }
		    System.out.println("Maximum threads inside pool " + executor.getMaximumPoolSize());
		    executor.shutdown();
		    
			while (!executor.isTerminated()) {}
	        System.out.println("Finished all threads");
	}
}
