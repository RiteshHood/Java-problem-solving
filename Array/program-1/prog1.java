
/*Problem 1 — Easy Number Problem

    Question:
    Write a Java program to find the sum of all digits of a number.

    Example:

    Input:  5832
    Output: 18
    
*/

import java.util.Scanner;

public class prog1 {

    public static void main(String[] args) {

        long sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number = sc.nextLong();

        while (number > 0) {
            long digit = number % 10;
            sum = digit + sum;
            number = number / 10;
        }

        System.out.println(sum);
    }

}
