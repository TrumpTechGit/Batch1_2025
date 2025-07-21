package in.trump.classes;

import in.trump.interfaces.Wish;

public class Greeting1 implements Wish {

	@Override
	public void wishMessage() {
		System.out.println("Greeting1 implements Wish -- Hello");
	}

	public static void main(String[] args) {
		Wish w = new Greeting1();
		w.wishMessage();
	}
}
