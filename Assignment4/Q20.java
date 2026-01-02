//Using do–while, find whether a number is palindrome, but: Exit loop early if mismatch is found
// FOR LOOP (Advanced Logic)

package Assignment4;

import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        boolean mismatch = false;

        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
            if (rev > temp) {
                mismatch = true;
                break;
            }
        }
        while (num > 0);
        if (mismatch == false) {
            if (rev == temp) {
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not a palindrome");
            }
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
