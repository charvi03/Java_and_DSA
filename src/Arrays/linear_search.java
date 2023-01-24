package Arrays;

public class linear_search {
    public static int search(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 11;
        int index = search(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index " + index);
        }
    }
}
