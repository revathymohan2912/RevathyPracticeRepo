package Assignment3;

abstract class Employee1{
	String employeeName;
	int employeeID;
	abstract void calculateSalary();
	
	Employee1(int employeeID, String employeeName) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
	}
	public void employeeDetails() {
		System.out.println("Name: "+ employeeName +" "+"ID: "+employeeID);
	}
}
class FullTimeEmployee extends Employee1{
	int salary;
	
	FullTimeEmployee(int employeeID, String employeeName) {
		super(employeeID, employeeName);
		this.salary= salary;
		}
	

	@Override
	void calculateSalary() {
		System.out.println("Full Time Employee Salary is 45000");
	}
}
class PartTimeEmployee extends Employee1{
	int salary;

	PartTimeEmployee(int employeeID, String employeeName) {
		super(employeeID, employeeName);
		this.salary = salary;
	}

	@Override
	void calculateSalary() {
		System.out.println("Part Time Employee Salary is 25000");
	}
	
}
public class Q17_AbstractClass {

	public static void main(String[] args) {
		Employee1 obj1 = new FullTimeEmployee(100, "Revathy");
		obj1.employeeDetails();
		obj1.calculateSalary();
		
		Employee1 obj2 = new PartTimeEmployee(101, "Akhil");
		obj2.employeeDetails();
		obj2.calculateSalary();
	}

}
