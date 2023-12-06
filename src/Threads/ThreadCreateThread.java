package Threads;

public class ThreadCreateThread extends Thread{
	public void run() {
		//System.out.println("Thread run");
		for(int i=0;i<3;i++) {
			System.out.println("-->"+Thread.currentThread().getName());
		}
	}
	
	public static void main(String a[]) {
		ThreadCreateThread obj = new ThreadCreateThread();
		ThreadCreateThread obj1 = new ThreadCreateThread();
		ThreadCreateThread obj2 = new ThreadCreateThread();		
		obj.start();
		obj1.start();
		obj2.start();
	}
}
