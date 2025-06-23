package in.trump.abstractkeyword;

public interface Sports {
	
	int team = 10;
	static final String couch = "ajay";
	
	void play();
	public abstract void run();
	
	default void sing() {
		//error: Abstract methods do not specify a body
		System.out.println("Sing method");
	}

}
