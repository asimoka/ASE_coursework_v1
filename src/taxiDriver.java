
public class taxiDriver {
	private String plateNumber;
	private String firstName;
	private String lastName;
	private String carType;
	
	public taxiDriver(String plateNumber, String firstName, String lastName, String carType){
		this.plateNumber=plateNumber;
		this.firstName=firstName;
		this.lastName=lastName;
		this.carType=carType;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	

}
