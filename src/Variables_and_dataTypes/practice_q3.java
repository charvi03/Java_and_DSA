package Variables_and_dataTypes;

import java.util.Scanner;

public class practice_q3 {
    public static void main(String[] args) {
        //Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        //an eraser. You have to output the total cost of the items back to the user as their bill.
        //Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser");
        float eraser = sc.nextFloat();
        float cost1 = pencil + pen + eraser;
        System.out.println("The amount of bill without gst " + cost1 + " Rs.");
        float gst = cost1 * 18 / 100;
        float cost2 = cost1 + gst;
        System.out.println("The amount of bill with 18% gst " + cost2 + " Rs.");

    }
}
