package Operators;

public class unary {
    public static void main(String[] args) {
        //pre increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        //post increment
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        //pre decrement
        int p = 10;
        int q = --p;
        System.out.println(p);
        System.out.println(q);
        //post decrement
        int r = 10;
        int s = r--;
        System.out.println(r);
        System.out.println(s);

    }
}
