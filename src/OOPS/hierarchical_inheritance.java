package OOPS;

public class hierarchical_inheritance {
    public static void main(String[] args) {
        Birds b=new Birds();
        b.fly();

    }
}

class Animal1 {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fishes extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("flies");
    }
}
