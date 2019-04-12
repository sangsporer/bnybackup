package linkedIn;

public class ParkingLot {
	
	int numberOfSmallRegularSpaces;
	int numberOfMediumRegularSpaces;
	int numberOfLargeRegularSpaces;
	int numberOfHadicapSmallSpaces;
	int numberOfHadicapMediumrSpaces;
	int numberOfHadicapLargeSpaces;

	public ParkingLot(int numberOfSmallRegularSpaces,
	int numberOfMediumRegularSpaces,
	int numberOfLargeRegularSpaces,
	int numberOfHadicapSmallSpaces,
	int numberOfHadicapMediumrSpaces,
	int numberOfHadicapLargeSpaces) {
		// TODO Auto-generated constructor stub
		this.numberOfSmallRegularSpaces = numberOfSmallRegularSpaces;
		this.numberOfMediumRegularSpaces = numberOfMediumRegularSpaces;
		this.numberOfLargeRegularSpaces = numberOfLargeRegularSpaces;
		this.numberOfHadicapSmallSpaces = numberOfHadicapSmallSpaces;
		this.numberOfHadicapMediumrSpaces = numberOfHadicapMediumrSpaces;
		this.numberOfHadicapLargeSpaces = numberOfHadicapLargeSpaces;
	}
	
	public ParkingSpace park(Vehicle c) {
		ParkingSpace attemptedPark = tryToPark(c);
		if (attemptedPark !=null) {
			attemptedPark.setIsTaken(true);
			System.out.println("The car has parked in a ");
		}
	}

}
