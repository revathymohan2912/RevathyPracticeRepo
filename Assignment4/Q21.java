//Print all numbers between 1 and 500 that: Have exactly 3 divisors

package Assignment4;

public class Q21 {

	public static void main(String[] args) {
		for (int i = 1; i <= 500; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.print(i + " ");
            }
        }
    }
}