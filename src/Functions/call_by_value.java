package Functions;

public class call_by_value {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        //swap--values exchange
        int a = 10;
        int b = 5;
        swap(a, b);
        //if we use print statement here then change will not be reflected

    }
}
