package StringsJava;

public class substrings {
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        //substring
        String str = "HelloWorld";
        //inbuilt
        System.out.println(str.substring(0,5));
        //function
        System.out.println(substring(str, 0, 5));
    }
}
