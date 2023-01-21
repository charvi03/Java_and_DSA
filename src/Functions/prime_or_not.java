package Functions;

public class prime_or_not {
    public static boolean isPrime(int n) {
        //boolean isPrime = true; // need not declare
        if (n==2){
            return true;
        }
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                // isPrime = false;
                // break; //or use return statement --return false
             return false;
            }
        }
        //return isPrime; // return true
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
        System.out.println(isPrime(5));
    }
}
