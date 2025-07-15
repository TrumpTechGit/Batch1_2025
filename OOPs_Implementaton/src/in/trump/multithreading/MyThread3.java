package in.trump.multithreading;

public class MyThread3 implements Runnable {

	@Override
	public void run() {
		 Thread t = Thread.currentThread();
		for(int i = 1; i<= 10; i++) {
			System.out.println(t.getName()+" thread value: "+i);
		}
	}

	public static void main(String[] args) {
		MyThread3 mt1 = new MyThread3();
		MyThread3 mt2 = new MyThread3();
		MyThread3 mt3 = new MyThread3();
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		Thread t3 = new Thread(mt3);
		
		//min = 1 nor=5 max=10
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
