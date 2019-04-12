package linkedIn;

import linkedIn.Vehicle.VehicleType;

public class LotRunner {

	public LotRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfSmallRegularSpaces = 9;
		int numberOfMediumRegularSpaces = 24;
		int numberOfLargeRegularSpaces = 10;
		int numberOfHadicapMediumrSpaces = 5;
		
		ParkingLot parkingLot = new ParkingLot(9,24,10,0,5,0);
		
		//parking
		System.out.println("Parking Medium Handicapped cars");
		for (int i = 0; i < 6; i++) {
			parkingLot.park(new Car(Vehicle.VehicleType.HANDICAPPED));		
		}
		
		System.out.println();
		
		System.out.println("Parking Large Regular trucks");
		for (int j = 0; j < 8; j++) {
			parkingLot.park(new Truck(Vehicle.VehicleType.REGULAR));		
		}
		
		System.out.println();
		
		System.out.println("Parking Medium Regular cars");
		for (int k = 0; k < 3; k++) {
			parkingLot.park(new Car(Vehicle.VehicleType.REGULAR));		
		}
		
		System.out.println();
		
		System.out.println("Parking Large Handicapped truck");
		parkingLot.park(new Truck(Vehicle.VehicleType.HANDICAPPED));
		
		System.out.println("Parking Large Regular truck");
		for (int i = 0; i < 6; i++) {
			parkingLot.park(new Truck(Vehicle.VehicleType.REGULAR));		
		}
		
		System.out.println();
		
		System.out.println("Parking Large Handicapped trucks");
		for (int j = 0; j < 8; j++) {
			parkingLot.park(new Truck(Vehicle.VehicleType.HANDICAPPED));		
		}
		
				
		
		

	}

}
