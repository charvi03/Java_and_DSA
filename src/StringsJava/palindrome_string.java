package StringsJava;

public class palindrome_string {
    public static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
                //not palindrome
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noon";
        String str1 = "racecar";
        String str2 = "charvi";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome(str2));

    }
}
