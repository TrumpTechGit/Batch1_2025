package in.trump.interfaces.impl;

import in.trump.interfaces.Vehicle;

public class Bike implements Vehicle {
	// The type Bike must implement the inherited abstract method
	// Vehicle.serviceVehicle(int)

	@Override
	public void serviceVehicle(int duration) {
		System.out.println("get service done in : " +duration + " days");
	}
	
//	@Override
//	public void driveVehicle() { //The method driveVehicle() of type Bike must override or implement a supertype method
//		System.out.println("Driver/Owner is driving");
//	}
	
	public static void main(String[] args) {
		Vehicle b = new Bike();
		b.serviceVehicle(45);
        b.startVehicle();
        //driveVehicle();
       // b.driveVehicle(); //This static method of interface Vehicle can only be accessed as Vehicle.driveVehicle
        Vehicle.driveVehicle();
        
	}
}
