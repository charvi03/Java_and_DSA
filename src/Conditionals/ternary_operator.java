package Conditionals;

public class ternary_operator {
    public static void main(String[] args) {
        int number = 9;
        //check odd even using ternary operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);

    }
}
