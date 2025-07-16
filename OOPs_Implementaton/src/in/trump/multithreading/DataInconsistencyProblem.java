package in.trump.multithreading;

class Counter {
	
	int count = 0; 
	
	//without synchronized key word we gett the data inconsistency
	public void increment() {
		count++; 
	}
	
//	public synchronized void increment() {
//		count++; 
//	}

}

public class DataInconsistencyProblem {

	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		
		Thread t1 = new Thread(() -> {
			for(int i=0; i<1000; i++) {
				c.increment();
			}
			System.out.println("Thread t1 finished");
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=0; i<1000; i++) {
				c.increment();
			}
			System.out.println("Thread t2 finished");
		});
		
		t1.start(); // start out thread run 
		t2.start();
		
		System.out.println("main thread waiting to finish t1 and t2 to finish");
		t1.join(); // completes first thread and wait for another thread
		t2.join();
		
		//no join here
		//System.out.println("main thread finished (without waiting) ");
		System.out.println("all thread finished");
		System.out.println("final count :"+c.count);
		
	}

	

}
