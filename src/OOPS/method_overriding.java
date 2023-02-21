package OOPS;

public class method_overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();

    }
}

class Animalz {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animalz {
    void eat() {
        System.out.println("eats grass");
    }
}
