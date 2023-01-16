package loopControl;

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("number is prime");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) { //n-1
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        }

    }
}
