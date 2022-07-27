import runtime.Sorter;

import java.util.ArrayList;
import java.util.function.Consumer;

public class BSTSort extends Sorter {
    @Override
    public int[] sort(int[] arr) {
        MyBST bst = new MyBST();
        for (int i = 0; i < arr.length; i++) {
            bst.insert(arr[i]);
        }

        ArrayList<Integer> sortedArray = bst.printTree();
        System.out.println(sortedArray.toString());
        int[] result = new int[sortedArray.size()];
        for (int i = 0; i < sortedArray.size(); i++) {
            result[i] = sortedArray.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        BSTSort bstSort = new BSTSort();
        int[] a = new int[] {6, 1, 5, 2, 4, 7, 3};
        bstSort.sort(a);
    }
}
