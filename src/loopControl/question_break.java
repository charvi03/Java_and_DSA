package loopControl;

import java.util.Scanner;

public class question_break {
    public static void main(String[] args) {
        //keep enetering ill multiple of 10
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
        } while (true);
    }
}
