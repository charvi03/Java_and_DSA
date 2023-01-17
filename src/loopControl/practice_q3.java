package loopControl;

import java.util.Scanner;

public class practice_q3 {
    public static void main(String[] args) {
        //program to find the factorial of any number entered by the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for finding factorial");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        System.out.println("Factorial of the number is "+fact);
    }
}
