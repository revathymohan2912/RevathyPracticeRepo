//Using do–while, print digits of a number from left to right
//(No strings, no arrays)

package Assignment4;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int div = 1;
        // Step 1: Find the highest power of 10
        do {
        	div = div * 10;
            temp = temp / 10;
        } while (temp > 0);

        div = div / 10;

        // Step 2: Print digits from left to right
        do {
            int digit = num / div;
            System.out.print(digit + " ");

            num = num % div;
            div = div / 10;

        } while (div > 0);
    }
}