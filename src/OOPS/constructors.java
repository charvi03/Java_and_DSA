package OOPS;

public class constructors {
    public static void main(String[] args) {
        Students s1 = new Students("charvi");//DEFAULT CONSTRUCTOR
        System.out.println(s1.name);
        Students s2 = new Students(12);
        System.out.println(s1.roll);
        Students s3 = new Students();
        System.out.println();

    }
}

class Students {
    String name;
    int roll;

    //constructor
    //non parameterized
    Students() {
        System.out.println("constructor is called");
    }

    Students(String name) {

        this.name = name;
    }

    Students(int roll) {

        this.roll = roll;
    }
}
