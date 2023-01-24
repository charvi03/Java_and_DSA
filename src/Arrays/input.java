package Arrays;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("sub1 : " + marks[0]);
        System.out.println("sub2 : " + marks[1]);
        System.out.println("sub3 : " + marks[2]);
        // marks[2] = marks[2] + 1; // can use any operation
        // System.out.println("sub3 : " + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage " + percentage + "%");
        System.out.println("length of array " + marks.length);
    }
}
