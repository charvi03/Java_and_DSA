package OOPS;

public class practice_ques2 {
    public static void main(String[] args) {
        //which variables can class person access the following code
        Person p = new Person();
        //can access name and weight
        p.name = "ck";
        p.weight = 52;
    }
}

class Person {
    String name;
    int weight;
}

class Student1 extends Person {
    int rollNumber;
    String schoolName;
}
