package Assignment3;

class University {
	static String country = "India";
	String universityName;
	public void display() {
		System.out.println("University: "+ universityName+" "+"Country: "+country);
	}
}

public class Q21_StaticConcepts {

	public static void main(String[] args) {
		University obj = new University();
		obj.universityName = "Kerala University";
		obj.display();
		University obj1 = new University();
		obj1.universityName = "Calicut University";
		obj1.display();
	}

}
