package in.trump.interfaces.impl;

import in.trump.interfaces.Vehicle;

public class Bike implements Vehicle {
	// The type Bike must implement the inherited abstract method
	// Vehicle.serviceVehicle(int)

	@Override
	public void serviceVehicle(int duration) {
		System.out.println("get service done in : " +duration + " days");
	}

	public static void main(String[] args) {
		Vehicle b = new Bike();
		b.serviceVehicle(45);
        b.startVehicle();
	}
}
