package Conditionals;

public class ifElse {
    public static void main(String[] args) {
        int age = 77;
        if (age >= 18) {
            System.out.println("adult: drive,vote");
        } else if (age > 13 && age < 18) {
            System.out.println("teenage");
        } else {
            System.out.println("not adult");
        }
    }
}
