package OOPS;

public class multi_level_inheritance {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4;
        System.out.println(doggy.legs );
    }
}

  class Animals {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animals {
    int legs;
}

class Dog extends Mammals {
    String breed;
}
