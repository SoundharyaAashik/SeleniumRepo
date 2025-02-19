package week3.day2;

public class Vehicle {
	
	public void applyBrake() {
		System.out.println("Brake Applied");
	}

	public static void main(String[] args) {

		Vehicle vehicleOptions = new Vehicle();
		vehicleOptions.applyBrake();
	}

}
