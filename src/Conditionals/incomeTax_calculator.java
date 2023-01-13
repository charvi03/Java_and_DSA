package Conditionals;

import java.util.Scanner;

public class incomeTax_calculator {
    public static void main(String[] args) {
        // income < 5l --- 0%
        // income between 5-10l --- 20%
        // income >10l--- 30%
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax is " + tax);
    }
}
