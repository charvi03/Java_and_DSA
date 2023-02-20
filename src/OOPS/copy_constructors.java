package OOPS;

public class copy_constructors {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.name = "charvi";
        s1.roll = 167;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Stu s2 = new Stu(s1);//copy
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Stu {
    String name;
    int roll;
    String password;
    int marks[];
    //copy constructor
    //shallow copy constructor


    //    Stu(Stu s1) {
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }
    //deep copy constructor
    Stu(Stu s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    //constructor
    //non parameterized
    Stu() {
        marks = new int[3];
        System.out.println("constructor is called");
    }

    Stu(String name) {
        marks = new int[3];

        this.name = name;
    }

    Stu(int roll) {
        marks = new int[3];

        this.roll = roll;
    }
}
