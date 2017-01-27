

public class trip {
	private String plateNumber;
	private String startLocation;
	private String endLocation;
	private double travelDistance;
	private double travelTime;
	private int passengerQuantity;
	private String tripDate;
	
	public trip(String plateNumber, String startLocation, String endLocation, double travelDistance, double travelTime, int passQuant, String tripDate){
		this.plateNumber=plateNumber;
		this.startLocation=startLocation;
		this.endLocation=endLocation;
		this.travelDistance=travelDistance;
		this.passengerQuantity=passQuant;
		this.tripDate=tripDate;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public double getTravelDistance() {
		return travelDistance;
	}

	public void setTravelDistance(double travelDistance) {
		this.travelDistance = travelDistance;
	}

	public double getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(double travelTime) {
		this.travelTime = travelTime;
	}

	public int getPassengerQuantity() {
		return passengerQuantity;
	}

	public void setPassengerQuantity(int passengerQuantity) {
		this.passengerQuantity = passengerQuantity;
	}

	public void setTripDate(String tripDate) {
		this.tripDate = tripDate;
	}
	
	
	public String getYear(){
		return this.tripDate.substring(6, 10);
	}

}
