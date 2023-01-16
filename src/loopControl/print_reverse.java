package loopControl;

import java.util.Scanner;

public class print_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + "");
            n = n / 10;

        }
    }
}
