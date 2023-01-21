package Functions;

public class function_overloading {
    //using params
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("func 1" + sum(3, 5));
        System.out.println("func 2" + sum(5, 2, 1));
    }
}
