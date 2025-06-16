package in.trump.students;

public class Car {
	
	String brand;
	String model;
	int year;
	
	public Car() {
		//zero param constructor
		System.out.println("Car.Car()"); //systrace + ctrl + space
	}
	
	//alt + shift + s
	public Car(String brand, String model, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public void startEngine() {
		System.out.println(brand+" "+model+" Car engine has started");
	}

}
