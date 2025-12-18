package Assignment3;

class School1{
	String name;
	String address;
	int strength;
	
	School1(String name, String address){
		this.name = name;
		this.address = address;
		}
	School1(String name, String address, int strength){
		this.name = name;
		this.address = address;
		this.strength = strength;
    }
	public void display() {
		System.out.println("Name: "+name + " " + "Address: "+address + " " + "Strength :"+strength);
    }
}
public class Q26_JavaProgram3 {

	public static void main(String[] args) {
		School1 obj = new School1("ST: Mary's", "ALAPPUZHA");
		obj.display();
		School1 obj1 = new School1("ST: Mary's", "ALAPPUZHA", 1000);
		obj1.display();
	}

}
