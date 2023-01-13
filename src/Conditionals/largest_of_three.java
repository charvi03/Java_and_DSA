package Conditionals;

public class largest_of_three {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 6;

        if ((a >= b) && (a >= c)) {
            System.out.println("A is largest");
        } else if (b >= c) {
            System.out.println("B is largest");

        } else {
            System.out.println("C is largest");
        }
    }
}
