//Write a program to find the largest of four numbers 
//using: Nested if–else only No loops No arrays

package Assignment4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    System.out.println("Largest number is: " + num1);
                } else {
                    System.out.println("Largest number is: " + num4);
                }
            } else {
                if (num3 > num4) {
                    System.out.println("Largest number is: " + num3);
                } else {
                    System.out.println("Largest number is: " + num4);
                }
            }
        } else {
            if (num2 > num3) {
                if (num2 > num4) {
                    System.out.println("Largest number is: " + num2);
                } else {
                    System.out.println("Largest number is: " + num4);
                }
            } else {
                if (num3 > num4) {
                    System.out.println("Largest number is: " + num3);
                } else {
                    System.out.println("Largest number is: " + num4);
                }
            }
        }
    }
}
