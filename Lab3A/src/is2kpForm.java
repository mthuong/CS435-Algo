public class is2kpForm {
    public static void main(String[] args) {

        System.out.println(is2kp(18, 24));
    }

    static boolean is2kp(int m, int n) {
        int g = gcd(m, n);
        for (int i = 2; i * i <= g; i++) {
            if (isPrime(i)) {
                int p = i;
                double k = Math.log(g/p)/Math.log(2);
                if (k % 1 == 0 && k >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    static int gcd(int m, int n) {
        if (n == 0) return m;
        return gcd(n, m % n);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
