package Thread;

public class HelloThreadRunnable extends Thread  implements Runnable {
	
	public void run() {
		System.out.println(" Hello From thread ");
	}

	public static void main(String[] args) {
		 HelloThreadRunnable runThread = new HelloThreadRunnable();
		 Thread th = new Thread (runThread);
		
		 th.start();
	}
}
