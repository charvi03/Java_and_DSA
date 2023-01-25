package Arrays;

public class largest_num {
    //find largest  number in array
    public static int largest(int num[]) {
        int largest = Integer.MIN_VALUE;//-INFINITY
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("smallest is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest is " + largest(numbers));
    }
}
