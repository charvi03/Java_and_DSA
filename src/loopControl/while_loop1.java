package loopControl;

import java.util.Scanner;

public class while_loop1 {
    public static void main(String[] args) {
        //print 1 to n numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int count = 1;
        while (count <= n) {
            System.out.println(count);
            count++;
        }
    }
}
