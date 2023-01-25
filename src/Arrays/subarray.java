package Arrays;

public class subarray {
    public static void printSubArray(int num[]) {
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");//print

                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray : " + total);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArray(numbers);
    }
}
