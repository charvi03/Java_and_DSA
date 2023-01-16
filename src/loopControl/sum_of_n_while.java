package loopControl;

import java.util.Scanner;

public class sum_of_n_while {
    public static void main(String[] args) {
        //sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
