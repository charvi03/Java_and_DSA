package Recursion;

public class tiling_problem {
    public static int tiling(int n) { //2 x n
        if (n == 0 || n == 1) {
            return 1;
        }
        //choice--vertical
        int fnm1 = tiling(n - 1);
        //horizontal choice
        int fnm2 = tiling(n - 2);

        int totalWays = fnm1 + fnm2;
        return totalWays;


    }

    public static void main(String[] args) {
        System.out.println(tiling(3));
    }
}
