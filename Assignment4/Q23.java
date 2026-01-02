/* Print this pattern using nested for:
1
12
123
1234
12345          But skip printing 3 in all rows*/

package Assignment4;

public class Q23 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 3) {
                    continue; //3 skip
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}