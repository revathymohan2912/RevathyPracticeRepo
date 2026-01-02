package Assignment4;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("MENU");
            System.out.println("Select 1 for Add");
            System.out.println("Select 2 for Subtract");
            System.out.println("Select 3 for Multiply");
            System.out.println("Select 4 for Exit");
            System.out.print("Enter your Option: ");

            option = sc.nextInt();
            if (option == 1) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Result = " + (a + b));

            } else if (option == 2) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Result = " + (a - b));

            } else if (option == 3) {
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Result = " + (a * b));

            } else if (option == 4) {
                System.out.println("Exiting");

            } else {
                System.out.println("Invalid choice");
            }

        } while (option != 4);
    }
}
