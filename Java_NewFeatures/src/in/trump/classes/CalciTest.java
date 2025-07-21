package in.trump.classes;

import in.trump.interfaces.Calculator;

public class CalciTest {

	public static void main(String[] args) {
		Calculator c = (a,b) -> System.out.println(a+b);
		c.add(2, 5);
	}

}
