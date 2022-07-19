import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 5, 8, 17};
//        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{2, 4, 8, 11, 13, 21, 23, 25};
        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
        result = merge(arr2, arr1);
        System.out.println(Arrays.toString(result));
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, n = arr1.length + arr2.length;
        int[] result = new int[n];
        int ij = 0;
        while (ij < n) {
            if (i >= arr1.length) {
                result[ij] = arr2[j];
                j++;
            } else if (j >= arr2.length) {
                result[ij] = arr1[i];
                i++;
            } else if (arr1[i] < arr2[j]) {
                result[ij] = arr1[i];
                i++;
            } else {
                result[ij] = arr2[j];
                j++;
            }
            ij = i + j;
        }
        return result;
    }
}