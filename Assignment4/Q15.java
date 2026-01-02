//Using while, print the following sequence:1 2 4 7 11 16 22 ...
//(up to N terms) DO–WHILE LOOP (Edge Cases)

package Assignment4;
import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int term = 1;
        int inc = 0;
        int count = 1;
        do {
            System.out.print(term + " ");
            inc = inc + 1;
            term = term + inc;
            count++;
        } while (count <= n);
    }
}