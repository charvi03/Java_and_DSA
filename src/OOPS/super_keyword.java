package OOPS;

public class super_keyword {
    public static void main(String[] args) {
        Horses h=new Horses();
        System.out.println(h.color);


    }
}
class Species{
    String color;
     Species(){
         System.out.println("animal constructor is called");
     }

}
class Horses extends Species{
    Horses(){
        super.color="brown";
        //super();
        System.out.println("horse is constructed");
    }
}
