package in.trump.classes;

import in.trump.interfaces.Wish;

class Greeting {
	public static void main(String[] args) {
		Wish wish = () -> System.out.println("Hello");
		wish.wishMessage();
	}
}
