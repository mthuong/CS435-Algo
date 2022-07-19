import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lab1A_5B {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 9, 4, 8, 5};
        System.out.println(find(Arrays.stream(arr).sorted().toArray(), 8));
    }

    public static boolean find(int[] arr, int z) {
        return binarySearch(arr, 0, arr.length - 1, z);
    }

    public static boolean binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return true;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return false;
    }

}
