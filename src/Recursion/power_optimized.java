package Recursion;

public class power_optimized {
    public static int powerOpt(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = powerOpt(x, n / 2);
        int halfPowersq = halfPower * halfPower;
        //n is odd
        if ((n % 2) != 0) {
            halfPowersq = x * halfPowersq;
        }
        return halfPowersq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(powerOpt(x, n));

    }
}
