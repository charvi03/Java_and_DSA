package Variables_and_dataTypes;

import java.util.Scanner;

public class practice_q1 {
    public static void main(String[] args) {
        //input 3 numbers : A, B and C and find average
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("Average is " + avg);

    }
}
