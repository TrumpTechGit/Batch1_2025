package topic.innerclasses;

class Outer {
	private String message = "Hello from outer class";
	
	class Inner {
		void display() {
			System.out.println("message :"+message);
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner =outer.new Inner();
		inner.display();
	}

}
