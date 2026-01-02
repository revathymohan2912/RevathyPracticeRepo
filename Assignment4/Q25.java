/*Write a program to print all perfect numbers between 1 and 10000 using:
Nested for
if condition only
A number is perfect if the sum of its proper divisors (excluding itself) equals the number.
eg: 6--> 1+2+3*/

package Assignment4;

public class Q25 {

	public static void main(String[] args) {
		
		for (int num = 1; num <= 10000; num++) {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == num) {
                if (num != 0) {
                    System.out.println(num);
                }
            }
        }
    }
}
