//Using for, find the largest palindrome number between 100 and 1000

package Assignment4;

public class Q22 {

	public static void main(String[] args) {
		int largestPalindrome = 0;
        for (int i = 100; i <= 1000; i++) {
            int num = i;
            int rev = 0;
            for (int temp = num; temp > 0; temp = temp / 10) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
            }
            if (num == rev) {
                if (num > largestPalindrome) {
                    largestPalindrome = num;
                }
            }
        }

        System.out.println("Largest palindrome between 100 and 1000 is: " + largestPalindrome);
    }
}