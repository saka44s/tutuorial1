package Threads;

public class ThreadCreateRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Running");
	}
	
	public static void main(String a[]) {
		ThreadCreateRunnable obj = new ThreadCreateRunnable();
		Thread tr = new Thread(obj);
		tr.start();
	}
	
}
