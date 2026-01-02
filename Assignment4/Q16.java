//Write a program that: Takes user input until a negative number is entered
//Prints sum of all even numbers entered
//Use do–while

package Assignment4;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num >= 0) { 
                if (num % 2 == 0) {
                    sum = sum + num;
                }
            }
        } while (num >= 0);
        System.out.println("Sum of even numbers: " + sum);
    }
}