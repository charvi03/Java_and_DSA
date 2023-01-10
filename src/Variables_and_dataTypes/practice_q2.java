package Variables_and_dataTypes;

import java.util.Scanner;

public class practice_q2 {
    public static void main(String[] args) {
        //area of square
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("The area is " + area + " sq.m");
    }
}
