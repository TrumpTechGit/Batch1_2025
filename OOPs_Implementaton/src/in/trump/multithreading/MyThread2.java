package in.trump.multithreading;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		 Thread currentThread = Thread.currentThread();
		for(int i = 1; i<= 10; i++) {
			System.out.println("user thread value : "+currentThread.getName()+" "+i);
		}
	}

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt);
		t.start();
		//t.run();
		for(int i = 1; i<= 10; i++) {
			System.out.println("Main thread value : "+t.currentThread().getName()+" "+i);
		}
	}

}
