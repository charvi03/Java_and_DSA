package Advanced_patterns;

public class inverted_rotated_half_pyramid {
    public static void printStars(int rows, int cols) {
        int n = 4;
        for (int i = 1; i <= rows; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printStars(4, 4);
    }
}
