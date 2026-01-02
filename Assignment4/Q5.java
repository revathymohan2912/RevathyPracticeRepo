/*Write a program that prints:
"A" if number divisible by 2 and 3
"B" if divisible by 3 and not by 2
"C" if divisible by 2 and not by 3
"D" otherwise
🔹 NESTED IF–ELSE (Complex Conditions)*/

package Assignment4;

public class Q5 {

	public static void main(String[] args) {
		
		
        int num = 13;

        if (num % 2 == 0) {
            if (num % 3 == 0) {
                System.out.println("A");
            } else {
                System.out.println("C");
            }
        } else {
            if (num % 3 == 0) {
                System.out.println("B");
            } else {
                System.out.println("D");
            }
        }
    }
}