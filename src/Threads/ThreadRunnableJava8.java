package Threads;

public class ThreadRunnableJava8 {
	public static void main(String a[]) {
		test();
	}
	
	public static void test1(){
		Runnable r = () -> {
	        for (int i = 0; i <= 4; i++) {
	            System.out.println(Thread.currentThread().getName() + ": " + i);
	        }
	    };
	    
	    Thread t1 = new Thread(r);
	    Thread t2 = new Thread(r);
	    Thread t3 = new Thread(r);
	    
	    t1.start();
	    t2.start();
	    t3.start();
	}
	
	public static void test() {
		Runnable r = () -> {
			System.out.println("In Runnable");
		};
		
		Thread t = new Thread(r);
		t.start();
	}
}


