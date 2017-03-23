// Super class that we'll use for this example
public class Person {
	private int _age;
	private String _name;
	private float _heightInInches;
	private float _massInPounds;

	// Getters and Setters (Properties)
	public int getAge() {
		return this._age;
	}

	public void setAge(int age) {
		this._age = age;
	}

	public String getName() {
		return this._name;
	}

	public void setNme(String name) {
		this._name = name;
	}

	public float getHeightInInches() {
		return this._heightInInches;
	}

	public void setHeightInInches(float heightInInches) {
		this._heightInInches = heightInInches;
	}

	public float get_massInPounds() {
		return this._massInPounds;
	}

	public void set_massInPounds(float massInPounds) {
		this._massInPounds = massInPounds;
	}

	Person(String name, int age, int heightInInches, float massInPounds) {
		this._name = name;
		this._age = age;
		this._heightInInches = heightInInches;
		this._massInPounds = massInPounds;
	}
	
	// Public methods
	public void eats() {
		System.out.println(this._name + " is eating");
	}
	
	public void walks() {
		System.out.println(this._name + " is walking");
	}
	
	public void speaks() {
		System.out.println(this._name + " is speaking");
	}

}
