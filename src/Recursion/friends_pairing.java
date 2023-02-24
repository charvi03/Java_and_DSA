package Recursion;

public class friends_pairing {
    public static int pair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        //choice
        int fnm1 = pair(n - 1);
        //pair
        int fnm2 = pair(n - 2);
        int pairWays = (n - 1) * fnm2;
        return fnm1 + pairWays;
    }

    public static void main(String[] args) {
        System.out.println(pair(3));

    }
}
