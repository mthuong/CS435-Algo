public class Lab1A_2 {
    public static void main(String[] args) {
//        int[] arr = new int[] {1, 4, 2, 3};
        int[] arr = new int[] {3, 3, 4, 7};
        System.out.println(secondSmallest(arr));
    }

    /**
     * Complexity is O(n) - because we loop the array 1 times
     * Space complexity is O(1) - because we use 2 variables to store min and secondMin
     */
    public static int secondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        //implement
        int min = arr[0], secondMin = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int ni = arr[i];
            if (min > ni) {
                secondMin = min;
                min = ni;
            } else {
                if (secondMin > ni) {
                    secondMin = ni;
                }
            }
        }
        return secondMin;
    }
}
