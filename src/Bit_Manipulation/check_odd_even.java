package Bit_Manipulation;

public class check_odd_even {
    public static void oddEven(int n){
        int bitMask=1;
        if ((n & bitMask)==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(12);
    }
}
