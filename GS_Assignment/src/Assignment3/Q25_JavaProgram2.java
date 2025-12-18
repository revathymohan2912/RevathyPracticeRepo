package Assignment3;

class School{
	String name;
	School(){
		name = "ST: Mary's";
		System.out.println("School Name: "+name);
	}
	public void display() {
		System.out.println("This School is based out of Kolkata");
	}
}
public class Q25_JavaProgram2 {

	public static void main(String[] args) {
		School obj = new School();
		obj.display();
	}

}
