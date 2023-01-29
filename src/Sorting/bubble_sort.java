package Sorting;

public class bubble_sort {
    public static void sort(int arr[]) {
        boolean swapped;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        // int arr1[] = {1, 2, 3, 4, 5};
        sort(arr);
        printarr(arr);
//        sort(arr1);
//        printarr(arr1);

    }
}
