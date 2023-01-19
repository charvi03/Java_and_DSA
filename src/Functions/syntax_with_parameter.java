package Functions;

import java.util.Scanner;

public class syntax_with_parameter {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
        // System.out.println("Sum is :" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        System.out.println("Enter the number ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("sum is : " + sum);
        //calculateSum(a, b);
    }
}
