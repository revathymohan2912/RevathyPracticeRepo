//Input a number and check: If it’s a 3-digit number
//If yes, check whether the sum of digits is even or odd
//➡ Use nested if only
// WHILE LOOP (Tricky Iterations)

package Assignment4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        if (num >= 100) {
            if (num <= 999) {
                int sum = 0;
                while (num > 0) {
                    int no = num % 10;
                    sum = sum + no;
                    num = num / 10;
                }
                if (sum % 2 == 0) {
                    System.out.println("It is a 3-digit number and sum of digits is EVEN");
                } 
                else {
                    System.out.println("It is a 3-digit number and sum of digits is ODD");
                }

            } 
            else {
                System.out.println("Not a 3-digit number");
            }
        } 
        else {
            System.out.println("Not a 3-digit number");
        }
    }
	}
