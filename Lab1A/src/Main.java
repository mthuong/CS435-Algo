import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[] {11, 2, 7, 15};
        int z = 9;
        System.out.println(sumFound(arr, z));
    }

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