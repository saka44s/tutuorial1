package Threads;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
	private String name;
	
	public String getName() {
		return name;
	}
	public Task(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		try{
		  System.out.println("-->"+Thread.currentThread().getName());
	      Long duration = (long) (Math.random() * 10);
	      System.out.println("Doing a task during : " + name);
	      TimeUnit.SECONDS.sleep(duration);
	    }catch (InterruptedException e){
	      e.printStackTrace();
	    }
	}
	
}
