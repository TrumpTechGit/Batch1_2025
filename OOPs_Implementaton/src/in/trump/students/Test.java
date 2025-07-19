package in.trump.students;

public class Test {
	
	void m1() {
		System.out.println("hiiii ...");
	}

	public static void main(String[] args) {
		
		
		Car c = new Car("VW","Polo",2018);
		System.out.println(c.brand);
		System.out.println(c.model);
		System.out.println(c.year);
		
		c.startEngine();
	}

}
