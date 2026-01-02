
/*Given age and salary: If age < 25 → Not eligible
If age ≥ 25 and salary < 30000 → Eligible for loan A
If age ≥ 30 and salary ≥ 50000 → Eligible for loan B
➡️ Use deep nested if*/

package Assignment4;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Enter Salary: ");
		int salary = sc.nextInt();
		
		if(age<25) {
			System.out.println("Not Eligible");
		}
		else {
			if(age>=30) {
				if(salary>=50000) {
					System.out.println("Eligible for Loan B");
				}
				else {
					System.out.println("Not Eligible");
				}
			}
			else {
				if(salary<30000) {
					System.out.println("Eligible for Loan A");
					
				}
				else {
					System.out.println("Not Eligible");
				}
				
			}
		}
		
	}

}
