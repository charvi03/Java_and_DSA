package Advanced_patterns;

public class palindromic_pattern {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //dec loop
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //asc loop
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
