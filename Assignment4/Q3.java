/*Write a program to check if a year is a leap year but:
 * take input as year and check whether it is leap or not??
 * */

package Assignment4;

public class Q3 {

	public static void main(String[] args) {
		int y = 2024;

		if(y % 4 == 0 ){
		    System.out.println(y+" is a Leap Year");
		}
		else {
		    System.out.println(y+" is Not a Leap Year");
		}
	}

}
