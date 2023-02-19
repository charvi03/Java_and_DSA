package StringsJava;

public class charAt_string {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstName = "charvi";
        //String lastName = "khurana";
        System.out.println(firstName.charAt(0));
        System.out.println(firstName.charAt(1));
        printLetters(firstName);
    }
}
