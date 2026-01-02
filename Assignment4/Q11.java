//Print numbers from 1 to 100 but:
//Skip numbers divisible by both 3 and 5
//Stop completely when number reaches 77
//➡️ Use while only

package Assignment4;

public class Q11 {

	public static void main(String[] args) {
		int no = 1;
        while (no <= 100) {
        	if (no == 77) {
                break;
            }
        	if (no % 3 == 0) {
                if (no % 5 == 0) {
                    no++;
                    continue;
                }
            }
            System.out.println(no);
            no++;
        }
    }
}