public class Lab1B_7 {
    public static void main(String[] args) {
        for(int i = 0; i < 20; ++i) {
            System.out.println(generate(i));
        }
    }

    /**
     * a0 = 0
     * a1 = 1
     * a2 = a0 + a1 = 1
     * a3 = a2 + a1 = 2
     * an = a[n-1] + a[n-2]
     * @param n
     * @return
     */

    public static int generate(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a0 = 0, a1 = 1, an = 0;
        for (int i = 2; i <= n; i++) {
            an = a0 + a1;
            a0 = a1;
            a1 = an;
        }
        return an;
    }

}
