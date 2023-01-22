package Advanced_patterns;

public class hollow_rhombus {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //hollow rectangle
            for (int j = 1; j <= n; j++) {
                //cell(i,j)
                if (i == 1 || i == n || j == 1 || j == n) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
