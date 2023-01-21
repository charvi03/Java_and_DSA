package Functions;

public class isPrime_optimized {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        //return isPrime; // return true
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(18));
    }
}
