package Assignment3;
//1.Encapsulation + Getter/Setter

class Employee{
	private int empId;
    private String empName;
    private double salary;
	
    int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	String getEmpName() {
		return empName;
	}
	void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void displayDetails() {
		System.out.println("Employee ID: "+empId);
        System.out.println("Name: "+ empName);
        System.out.println("Salary: "+salary);
    }
    
}
public class Q1_Encapsulation {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setEmpId(404);
		obj.setEmpName("Revathy");
		obj.setSalary(45000);
		obj.displayDetails();
	}

}
