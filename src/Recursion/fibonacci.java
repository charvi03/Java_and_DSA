package Recursion;

public class fibonacci {
    //print nth term of fibonacci series
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibn = fibo(n - 1) + fibo(n - 2);
        return fibn;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibo(n));
    }
}
