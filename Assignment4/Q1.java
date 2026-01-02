/*Write a Java program that prints "VALID" only if a number:
is divisible by 3
NOT divisible by 5
lies between 50 and 200 (inclusive)
Otherwise print "INVALID"
➡️ Use only one if statement*/

package Assignment4;

public class Q1 {

	public static void main(String[] args) {
		int a = 2458;
		if(a<=200) {
			if(a>=50) {
				if(a%3 == 0 && a%5 != 0) {
					System.out.println("VALID");
				}
			}
		}
		else {
			System.out.println("INVALID");
		}
}

}
