import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lab1A_4A {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 9, 4, 8, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(arr).collect(Collectors.toList()));
        sort(list);
        System.out.println(list);
    }

    /**
     * Time complexity of heap sort is O(n log n) - because it takes O(log n) time to heapify each element and our heap is based on binary tree. And there are n elements, therefore O(n log n)
     * Space complexity is O(1) - because heap sort is in place
     */
    public static void sort(ArrayList<Integer> list){
        int n = list.size();
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = list.get(0);
            list.set(0, list.get(i));
            list.set(i, temp);

            heapify(list, i, 0);
        }
    }

    static void heapify(ArrayList<Integer> list, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && list.get(l) > list.get(largest))
            largest = l;

        if (r < n && list.get(r) > list.get(largest))
            largest = r;

        if (largest != i) {
            int swap = list.get(i);
            list.set(i, list.get(largest));
            list.set(largest, swap);

            heapify(list, n, largest);
        }
    }
}

