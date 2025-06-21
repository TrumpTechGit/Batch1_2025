package in.trump.polymorphism.methodoverriding;

public class Dog extends Animal {
	
	//This instance method cannot override the static method from Animal
	//Cannot override the final method from Animal
	public void eat() {
		System.out.println("Dog eats bones");
	}

//	public static void main(String[] args) {
//	Animal d = new Dog(); 
//	d.eat(); //The method eat() from the type Animal is not visible
//	}

}
