package in.trump.multithreading;

public class DaemonThreadDemo extends Thread {

	@Override
	public void run() {
	if(Thread.currentThread().isDaemon()) {//checking for deamon thread
		System.out.println("Daemon thread ");
	} else {
		System.out.println("user thread");
	}
	}

	public static void main(String[] args) throws Exception {
		DaemonThreadDemo t1 = new DaemonThreadDemo();
		DaemonThreadDemo t2 = new DaemonThreadDemo();
		DaemonThreadDemo t3 = new DaemonThreadDemo();
		
		t1.setDaemon(true); //now t1 is a daemon thread
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
