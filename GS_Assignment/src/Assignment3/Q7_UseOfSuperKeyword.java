package Assignment3;

class Person {
    Person() {
        System.out.println("Person Created");
    }
}

class Student extends Person {
    Student() {
        super();
        System.out.println("Student Created");
    }
}

public class Q7_UseOfSuperKeyword {
	public static void main(String[] args) {
		Student s = new Student();
		}
}
