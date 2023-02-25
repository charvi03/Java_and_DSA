package Recursion;

public class binary_string {
    public static void printBinary(int n, int lastPlace, StringBuilder str) {
        if (n == 0) {
            System.out.println(str);
        }
        printBinary(n - 1, 0, str.append("0"));
        if (lastPlace == 0) {
            printBinary(n - 1, 1, str.append("1"));
        }
    }

    public static void main(String[] args) {

    }
}
