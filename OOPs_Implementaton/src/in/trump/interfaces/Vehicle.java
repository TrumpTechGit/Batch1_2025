package in.trump.interfaces;

@FunctionalInterface
public interface Vehicle {
	//Invalid '@FunctionalInterface' annotation; Vehicle is not a functional interface
	
	void serviceVehicle(int duration);
	
	//void playMusic();
	
	default void startVehicle() {
		System.out.println("vehicle started !");
	}
	
	//static methods,variable can be called using class name
	static void driveVehicle() {
		System.out.println("Driver/Owner is driving");
	}

}
