package in.trump.polymorphism.methodoverriding;

public class DownCasting {

	public static void main(String[] args) {
		//upcasting
		 Animal a = new Dog();
		
		//downcasting
		Animal a1 = new Animal();
		Dog d = (Dog)a1;

	}

}
