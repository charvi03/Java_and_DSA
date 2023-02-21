package OOPS;

public class static_keyword {
    public static void main(String[] args) {
        Studentz s1 = new Studentz();
        s1.schoolName = "dav";
        Studentz s2 = new Studentz();
        System.out.println(s2.schoolName);
       

    }
}

class Studentz {
    String name;
    int roll;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
