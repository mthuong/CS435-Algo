package sortroutines;

import runtime.Sorter;

public class BubbleSort1 extends Sorter {
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        boolean swapped;
        for (int i = 0; i < len; i++) {
            swapped = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            // If no swap happens in the inner loop, it means the array was sorted. Then we can stop the process
            if (swapped == false) {
                break;
            }
        }

        return arr;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
