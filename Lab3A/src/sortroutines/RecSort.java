package sortroutines;

import runtime.Sorter;

import java.util.Arrays;

public class RecSort extends Sorter {
    public static void main(String[] args) {
        int[] list = new int[] {3,2,1,5,4,33,52,12,64,20,19};
        RecSort recSort = new RecSort();
        list = recSort.sort(list);
        System.out.println(Arrays.toString(list));
    }

    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            // Partition
            int mid = n / 2;
            int[] L1 = new int[mid];
            int[] L2 = new int[n - mid];
            for (int i = 0; i < arr.length; i++) {
                if (i < mid) {
                    L1[i] = arr[i];
                } else {
                    L2[i - mid] = arr[i];
                }
            }
            L1 = this.sort(L1);
            L2 = this.sort(L2);
            arr = merge(L1, L2);
        }
        return arr;
    }

    int[] merge(int[] L1, int[] L2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] L = new int[L1.length + L2.length];
        while (i < L1.length && j <L2.length) {
            if (L1[i] <= L2[j]) {
                L[k++] = L1[i++];
            } else {
                L[k++] = L2[j++];
            }
        }
        while(i < L1.length) {
            L[k++] = L1[i++];
        }
        while(j < L2.length) {
            L[k++] = L2[j++];
        }
        return L;
    }
}
