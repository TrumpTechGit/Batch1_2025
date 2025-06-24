package in.trump.interfaces;

public interface Vehicle {
	
	void serviceVehicle(int duration);
	
	default void startVehicle() {
		System.out.println("vehicle started !");
	}

}
