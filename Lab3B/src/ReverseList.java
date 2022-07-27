import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverse(arr, 0)));
    }

    public static int[] reverse(int[] arr, int index) {
        if (arr.length <= 1) return arr;

        int endIndex = arr.length - index - 1;
        int startIndex = index;
        if (startIndex >= endIndex) return arr;

        int temp = arr[endIndex];
        arr[endIndex] = arr[startIndex];
        arr[startIndex] = temp;
        return reverse(arr, index + 1);
    }
}
