/*Input an integer and determine whether:
It is positive and divisible by 4
OR negative and divisible by 6*/

package Assignment4;

public class Q4 {

	public static void main(String[] args) {
		
		
		int a = -12;

		if (a > 0){
			if(a%4 == 0) {
				System.out.println("It is Positive and Divisible by 4");
			}
		}
		else {
			if(a%6 == 0) {
				System.out.println("It is Negative and Divisible by 6");
			}
		}
	}
}
