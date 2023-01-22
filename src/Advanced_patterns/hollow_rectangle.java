package Advanced_patterns;

public class hollow_rectangle {
    public static void printStar(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {
                //cell(i,j)
                if (i == 1 || i == rows || j == 1 || j == cols) {
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
        printStar(4, 5);

    }
}
