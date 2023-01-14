package Conditionals;

import java.util.Scanner;

public class practice_q5 {
    public static void main(String[] args) {
        // program that takes a year from the user and print whether that
        //year is a leap year or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }

            } else {
                System.out.println("It is a leap year");
            }
        } else {
            System.out.println("It is not a leap year");
        }

//        boolean x = (year % 4) == 0;
//        boolean y = (year % 100) != 0;
//        boolean z = ((year % 100 == 0) && (year % 400 == 0));
//        if (x && (y || z)) {
//            System.out.println(year + " is a leap year");
//        } else {
//            System.out.println(year + " is not a leap year");
//        }
    }
}
