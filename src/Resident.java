//Resident sub class of the Person superclass 
public class Resident extends Person {
    // Private instance variables
	private String _SIN;
	private Address _address;
	
	// Getters and Setters
	public String getSIN() {
		return this._SIN;
	}
	public void setAddress(String streetNumber, String streetName, 
			               String cityName, String provinceName) {
		this._address = new Address(streetNumber, streetName, cityName, provinceName);
	}
	
	public String getAddress() {
		return this._address.toString();
	}
	
	// Constructor
	Resident(String name, int age, int heightInInches, float massInPounds, String SIN) {
		super(name, age, heightInInches, massInPounds);
		this._SIN = SIN;
		
	}

}
