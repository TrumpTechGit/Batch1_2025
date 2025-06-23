package in.trump.abstractkeyword;

public class Car extends Vehicle {
    
	//if we can't implement super class method
	//error: The type Car must implement the inherited abstract method Vehicle.engine()
	
	@Override
	public void engine() { //concrete method
		System.out.println("Car engine");
	}
	
	//public abstract void horn(); //This method requires a body instead of a semicolon
   //The abstract method horn in type Car can only be defined by an abstract class
	
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.engine();
	}
	
}
