package loopControl;

import java.util.Scanner;

public class practical_q4 {
    public static void main(String[] args) {
        //print the multiplication table of a number N, entered by the
        //user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for finding factorial");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " " + "X" + " " + i + " = " + (n * i));

        }
    }
}
