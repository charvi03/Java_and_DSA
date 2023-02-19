package StringsJava;

import java.util.Scanner;

public class creation {
    public static void main(String[] args) {
        char arr[]={'a','b','c'};
        //declaring strings
        String str="abcd";
        String str1=new String("xyz");
        //input string
        Scanner sc= new Scanner(System.in);
        String name;
        System.out.println("enter a line");
        //.next takes single word
        //name=sc.next();
        //it take full line with spaces
        name= sc.nextLine();
        System.out.println(name);
        //finding length
        String str2="charvi khurana";
        System.out.println(str2.length());
    }
}
