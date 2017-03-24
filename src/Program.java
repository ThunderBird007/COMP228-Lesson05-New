// Program Driver class
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Alan", 36, 70.0f, 170.0f, "555 555 555", "2017ATse12345");
		
		student.eats();
		
		student.setAddress("55",  "Fifty-Fifth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(student.getAddress());
		
		student.changeAddress("44",  "Fourty-Fourth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(student.getAddress());

		student.addCourse("COMP101",  "Programming Fundamentals", "First Computer Course", 600.35);
		student.addCourse("COMP102",  "Programming Design", "First UML Course", 700.35);
		System.out.println(student.toString());
		//student.dropCourse("Programming Fundamentals");
		//student.dropCourse("Programming Design");
		student.dropCourse("Programming");
		System.out.println(student.toString());
	}

}
