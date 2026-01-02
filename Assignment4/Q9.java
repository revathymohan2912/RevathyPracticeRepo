/*Write a program that classifies a character as:
Uppercase vowel
Uppercase consonant
Lowercase vowel
Lowercase consonant*/

package Assignment4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (ch >= 'A') {
            if (ch <= 'Z') {
                if (ch == 'A') {
                    System.out.println("Uppercase vowel");
                }
                else if (ch == 'E') {
                    System.out.println("Uppercase vowel");
                }
                else if (ch == 'I') {
                    System.out.println("Uppercase vowel");
                }
                else if (ch == 'O') {
                    System.out.println("Uppercase vowel");
                }
                else if (ch == 'U') {
                    System.out.println("Uppercase vowel");
                }else {
                    System.out.println("Uppercase consonant");
                }

            } 
            else {
                if (ch >= 'a') {
                    if (ch <= 'z') {
                        if (ch == 'a') {
                            System.out.println("Lowercase vowel");
                        }
                        else if (ch == 'e') {
                            System.out.println("Lowercase vowel");
                        }
                        else if (ch == 'i') {
                            System.out.println("Lowercase vowel");
                        }
                        else if (ch == 'o') {
                            System.out.println("Lowercase vowel");
                        }
                        else if (ch == 'u') {
                            System.out.println("Lowercase vowel");
                        }
                        else {
                            System.out.println("Lowercase consonant");
                        }

                    }
                }
            }
        }
    }
}