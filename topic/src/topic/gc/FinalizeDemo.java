package topic.gc;

public class FinalizeDemo {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method is called");
	}
	
	public static void main(String[] args) {
		FinalizeDemo fd = new FinalizeDemo();
		fd = null;
		System.gc();
	}

}
