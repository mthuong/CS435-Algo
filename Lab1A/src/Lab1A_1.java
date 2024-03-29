import java.util.HashMap;

public class Lab1A_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[] {1,4,2,3};
        int z = 5;
        System.out.println(sumFound(arr, z));
    }

    /**
     * Complexity is O(n) - because we loop the array 1 times in the worse case
     * Space complexity is O(n) - because we use hash map to store all subtract values to find the element that we can make sum of them equal to z
     */
    public static boolean sumFound(int[] arr, int z) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        // implement
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i = 0; i < arr.length; i++) {
            Integer ni = arr[i];
            Integer subtract = z - ni;
            if (map.containsKey(ni)) {
                return true;
            }
            map.put(subtract, i);
        }

        return false;
    }
}