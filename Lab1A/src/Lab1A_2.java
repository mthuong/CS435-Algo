public class Lab1A_2 {
    public static void main(String[] args) {
//        int[] arr = new int[] {1, 4, 2, 3};
        int[] arr = new int[] {3, 3, 4, 7};
        System.out.println(secondSmallest(arr));
    }

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
