package Conditionals;

import java.util.Scanner;

public class practice_q1 {
    public static void main(String[] args) {
        // get a number from the user and print whether it is
        //positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is positive");

        } else {
            System.out.println("Number is negative");
        }
    }
}
