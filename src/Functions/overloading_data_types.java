package Functions;

public class overloading_data_types {
    //using data types
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("func 1 : " + sum(3, 5));
        System.out.println("func 2 : " + sum(3.2f, 4.8f));
    }
}
