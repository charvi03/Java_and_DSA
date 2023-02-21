package Recursion;

public class decreasing_order {
    //print n to 1 numbers in decreasing order
    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDecreasing(n);

    }
}
