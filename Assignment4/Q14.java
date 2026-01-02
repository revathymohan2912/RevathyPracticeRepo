//Write a program that prints the Fibonacci series up to N terms, but:
//Stop printing when a number exceeds 500

package Assignment4;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int count = 1;
        while (count <= n) {
            if (a > 500) {
                break;
            }
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
    }
}