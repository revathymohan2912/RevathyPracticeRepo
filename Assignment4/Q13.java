//Find the count of prime digits in a number using while loop only

package Assignment4;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 2) {
                count++;
            } else if (digit == 3) {
                count++;
            } else if (digit == 5) {
                count++;
            } else if (digit == 7) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Count of prime digits: " + count);
    }
}