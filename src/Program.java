// Program Driver class
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resident resident = new Resident("Alan", 36, 70.0f, 170.0f, "555 555 555");
		resident.eats();
		
		resident.setAddress("55",  "Fifty-Fifth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(resident.getAddress());
		
		resident.changeAddress("44",  "Fourty-Fourth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(resident.getAddress());

	}

}
