public class Lab1A_5A {
    public static void main(String[] args) {

    }

    public static boolean find(int[] arr, int z) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == z) {
                return true;
            }
        }
        return false;
    }
}
