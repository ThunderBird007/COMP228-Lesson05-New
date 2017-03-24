import java.util.ArrayList;

// Student class
public class Student extends Resident implements SchoolID {
	// Private instance variables
	private String _studentID;
	private String _schoolID;
	private ArrayList<Course> _courses = new ArrayList<Course>();

	Student(String name, int age, float heightInInches, float massInPounds, String SIN, String studentID) {
		super(name, age, heightInInches, massInPounds, SIN);
		// TODO Auto-generated constructor stub
		this._studentID = studentID;
	}

	public void addCourse(String courseCode, String courseName, String courseDescription, double courseCost) {
		this._courses.add(new Course(courseCode, courseName, courseDescription, courseCost));
	}

	public void dropCourse(String courseName) {
		int index = -1;
		// enhanced for loop - equivalent to a foreach in C#
		for (Course course : this._courses) {
			if (course.getName().equals(courseName)) {
				//this._courses.remove(course);
				index = this._courses.indexOf(course);
			}
		}
		
		if (index >= 0) {
			this._courses.remove(index);
		}

	}

	@Override
	public String toString() {
		String output = "";
		output += "Studen name: " + this._name + "\n";
		output += "StudentID: " + this._studentID + "\n";
		if (this._courses.size() > 0) {

			output += "Courses\n";
			output += "++++++++++++++++++++++++++++++++++++++++++++++++++\n";
			for (Course course : _courses) {
				output += course.getName() + "\n";
			}
			output += "++++++++++++++++++++++++++++++++++++++++++++++++++";
		}
		return output;
	}
	
	@Override
	public void addSchool(String schoolName) {
		this._schoolID = schoolName;
	}
	

}
