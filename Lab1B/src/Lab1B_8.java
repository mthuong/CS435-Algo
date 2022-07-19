public class Lab1B_8 {
    public static void main(String[] args) {
        System.out.println(smallestCommon(4, 6));
        System.out.println(smallestCommon(3, 5));
        System.out.println(smallestCommon(7, 14));
    }

    public static int smallestCommon(int x, int y) {
        if (x == 0) {
            return 0;
        }
        if (y == 0) {
            return 0;
        }
        for (int i = 1; i <= x*y; i++) {
            if (i % x == 0 && i % y == 0) {
                return i;
            }
        }
        return x*y;
    }
}
