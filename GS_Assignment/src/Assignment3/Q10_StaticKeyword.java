package Assignment3;

class Student1 {
    static String collegeName = "SVNCE";
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: "+name + " " + "Roll No: "+rollNo + " " +"College: "+ collegeName);
    }
    }

public class Q10_StaticKeyword {

	public static void main(String[] args) {
		Student1 obj1 = new Student1();
		obj1.name ="Revathy";
		obj1.rollNo = 25;
		Student1 obj2 = new Student1();
		obj2.name = "Akhil";
		obj2.rollNo = 23;
		obj1.display();
		obj2.display();
	}
}
