import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        //by default it takes the decimal value as double but to take it as float ue f
        // double area = 3.14 * radius * radius;
        System.out.println("The area is " + area);
    }
}
