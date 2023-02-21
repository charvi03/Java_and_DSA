package OOPS;

public class practice_ques3 {
    public static void main(String[] args) {
        //output of the program
        Veh obj1 = new Car();
        //obj1.print1(); ///will give error
        //func overriding --obj1.print();
        Veh obj2 = new Veh();
        obj2.print();
    }
}

class Veh {
    void print() {
        System.out.println("Base class");
    }
}

class Car extends Veh {
    //func overriding
//     void print(){
//         System.out.println("derived class");
//     }
    void print1() {
        System.out.println("derived class");
    }
}
