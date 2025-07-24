package in.trump.classes;

import java.util.function.Consumer;

public class StaticMethodRef {

	static void sayHello() {
		System.out.println("Hello from static method");
	}
	
	public static void main(String[] args) {
		//using lambda
		Consumer<Void> lambda = c -> StaticMethodRef.sayHello();
		
		//method ref
		Runnable r =  StaticMethodRef::sayHello;
		r.run();
	}

}
