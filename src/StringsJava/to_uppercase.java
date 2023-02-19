package StringsJava;

public class to_uppercase {
    public static String toupppercase(String str) {
        StringBuilder sb = new StringBuilder(" ");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i <str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //convert each first letter to uppercase
        String str = "hi,i am charvi";
        System.out.println(toupppercase(str));
    }
}
