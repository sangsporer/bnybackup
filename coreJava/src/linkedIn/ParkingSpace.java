package linkedIn;

public class ParkingSpace implements Space {

	private VehicleSize vehicleSize;
	private VehicleType type;
	private boolean isTaken;

	public ParkingSpace(VehicleSize vehicleSize, VehicleType type) {
		this.vehicleSize = vehicleSize;
		this.type = type;	
	}

	@Override
	public VehicleSize getSize() {
		// TODO Auto-generated method stub
		return this.vehicleSize;
	}

	@Override
	public VehicleType getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

	@Override
	public boolean getIsTaken() {
		// TODO Auto-generated method stub
		return this.isTaken;
	}

	@Override
	public void setIsTaken(boolean isTaken) {
		// TODO Auto-generated method stub
		this.isTaken = isTaken;
		
	}

}
