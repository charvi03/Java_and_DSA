package Bit_Manipulation;

public class check_powerOf_two {
    public static boolean isPoweroftwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPoweroftwo(15));
    }
}
