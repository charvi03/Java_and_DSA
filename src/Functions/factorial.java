package Functions;

public class factorial {
    // n! = n * n-1* n-2 * n-3.......1 OR
    //n! 1*2*3.......*n
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static void main(String[] args) {
        int solution = fact(5);
        System.out.println(solution);
    }
}
