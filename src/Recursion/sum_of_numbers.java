package Recursion;

public class sum_of_numbers {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sumn1 = sum(n - 1);
        int sn = n + sumn1;
        return sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));

    }
}
