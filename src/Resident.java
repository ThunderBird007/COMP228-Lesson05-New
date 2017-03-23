//Resident sub class of the Person superclass 
public class Resident extends Person {
	// Private instance variables
	private String _SIN;
	private Address _address;

	// Getters and Setters
	public String getSIN() {
		return this._SIN;
	}

	public void setAddress(String streetNumber, String streetName, String cityName, String provinceName) {
		this._address = new Address(streetNumber, streetName, cityName, provinceName);

	}

	public void changeAddress(String streetNumber, String streetName, String cityName, String provinceName) {
		this._address.change(streetNumber, streetName, cityName, provinceName);
	}
	public String getAddress() {
		try {
			return this._address.toString();
		} catch (Exception e) {
			// TODO: handle exception
			return "Error: Address not initialized";
		}
	}

	// Constructor
	Resident(String name, int age, float heightInInches, float massInPounds, String SIN) {
		super(name, age, heightInInches, massInPounds);
		this._SIN = SIN;

	}

}
