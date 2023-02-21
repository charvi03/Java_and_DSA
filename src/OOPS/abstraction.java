package OOPS;

public class abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();;
        h.walk();
        System.out.println(h.color);
        //A a=new A(); PROVIDE ERROR

    }
}
abstract class A{
    String color;
    A(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
    //it is abstract clas--- no implementation,
    // but imp to exist in all subclasses
}
class Horse extends A{
    //important to use walk() as it is abstract
    void walk(){
        System.out.println("walks on 4 legs");
    }
    void changeColor(){
        color="darkbrown";
    }
}
class Chicken extends A{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    void changeColor(){
        color="yellow";
    }
}