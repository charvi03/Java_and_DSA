package Functions;

public class product {
    public static int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 34;
        //int product = multiply(3, 5);
        int product = multiply(a, b);
        System.out.println("product is " + product);
    }
}
