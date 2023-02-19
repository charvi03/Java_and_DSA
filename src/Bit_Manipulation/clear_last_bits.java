package Bit_Manipulation;

public class clear_last_bits {
    public static int clearIBit(int n, int i) {
        int bitMask = ~(0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBit(15, 2));
    }
}
