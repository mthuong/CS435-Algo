import lab1.powerset.PowerSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lab1A_3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 9, 4, 8, 5};
        Integer k = 0;
        System.out.println(sumFound(Arrays.stream(arr).collect(Collectors.toList()), k));
    }

    /**
     * Complexity is O(n^n) -
     * Space complexity is n+n/2+n/4+...+1 = f(x) is O(n)
     *
     */
    public static boolean sumFound(List<Integer> list, int k) {
        //implement
        List<Set<Integer>> set = PowerSet.powerSet(list);
        for (Set<Integer> numbers: set) {
            Integer sum = 0;
            for (Integer number: numbers) {
                sum += number;
            }
            if (sum == k) {
                return true;
            }
        }
        return false;
    }
}
