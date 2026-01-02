//Write a program to reverse a number using while, but:
//Stop reversing if digit 0 is encountered
package Assignment4;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                break;
            }
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number : " + rev);
    }
}