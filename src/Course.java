// Course class
public class Course {
    // Private instance variables
	private String _code;
	private String _name;
	private String _description;
	private double _cost;
	
	// Getters and Setters
	public String getName() {
		return this._name;
	}
	public Course(String code, String name, String description, double cost) {
	    this._code = code;
	    this._name = name;
		this._description = description;
		this._cost = cost;
	}
	
	
}
