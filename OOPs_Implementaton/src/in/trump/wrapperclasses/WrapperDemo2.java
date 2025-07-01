package in.trump.wrapperclasses;

import java.io.FileReader;

public class WrapperDemo2 {

	public static void main(String[] args) {
		Integer a,b;
		a = new Integer(10); 
		a = 10; // auto boxing
		b = 20;  // auto boxing
		
		int c = a; // auto unboxing
		System.out.println(a+" "+b+" "+c);
		
		// Parsing
		String numberString = "12345";
		int number = Integer.parseInt(numberString);
		System.out.println("parsed integer :"+number);
		}
	
	

}
