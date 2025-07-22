package in.trump.classes;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable myThread = () -> {
			//set custom name to the thread
			Thread.currentThread().setName("MyThread");
			System.out.println(Thread.currentThread().getName()+ " is running");
		};
		
		Thread t = new Thread(myThread);
		t.start();
	}

}
