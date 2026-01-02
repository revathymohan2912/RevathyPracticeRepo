/*Given marks in Math, Physics, Chemistry, determine eligibility:
Math ≥ 60
Physics ≥ 50
Chemistry ≥ 40
AND
Total ≥ 180 OR Math + Physics ≥ 120*/

package Assignment4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maths marks: ");
		int maths = sc.nextInt();
		System.out.println("Enter Physics marks: ");
		int physics = sc.nextInt();
		System.out.println("Enter Chemistry marks: ");
		int chemistry = sc.nextInt();
		
		int total = maths + physics + chemistry;
		if (maths >= 60) {
			if (physics >= 50) {
				if (chemistry >= 40){
					if (total >= 180) {
						System.out.println("Eligible");
						}
					else{
						if(maths + physics >= 120) {
							System.out.println("Eligible");
							}
						else{
							System.out.println("Not Eligible");
							}
					}
				}
				else{
					System.out.println("Not Eligible");
					}
			}
			else{
				System.out.println("Not Eligible");
			}
		}
		else{
			System.out.println("Not Eligible");
		}
	}
}
