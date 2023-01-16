package loopControl;

import java.util.Scanner;

public class question_continue {
    public static void main(String[] args) {
        //display all numbers except multiple of10
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number is " + n);
            System.out.println();
        } while (true);
    }
}
