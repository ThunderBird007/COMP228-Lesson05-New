// Address class
public class Address {
    private String _streetNumber;
    private String _streetName;
    private String _cityName;
    private String _provinceName;
    
	// Constructor
	Address(String streetNumber, String streetName, 
			String cityName, String provinceName) {
		this._streetNumber = streetNumber;
		this._streetName = streetName;
		this._cityName = cityName;
		this._provinceName = provinceName;
	}
	
	@Override
	public String toString() {
		String output = "";
		output += "Address: \n";
		output = "++++++++++++++++++++++++++++++++++++++++ \n";
		output += this._streetNumber + " " + this._streetName + "\n";
		output +=this._cityName + " " + this._provinceName + "\n";
		return output;
		
	}
}