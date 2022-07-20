import java.util.ArrayList;
import java.util.Arrays;

public class Lab2B_6 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < arr.length; i++) {
            int ai = arr[i];
            if (ai == 0) {
                zero++;
            } else if (ai == 1) {
                one++;
            } else if (ai == 2) {
                two++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (zero != 0) {
                arr[i] = 0;
                zero--;
            } else if (one != 0) {
                arr[i] = 1;
                one--;
            } else if (two != 0) {
                arr[i] = 2;
                two--;
            }
        }
    }
}
