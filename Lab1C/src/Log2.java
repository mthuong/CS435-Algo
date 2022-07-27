public class Log2 {
    public static void main(String[] args) {
        System.out.println(log2(8));
    }

    static double log2(double x) {
        return Math.log10(x) / Math.log10(2);
    }
}
