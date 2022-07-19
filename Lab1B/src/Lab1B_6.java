import java.util.*;
import java.util.stream.Collectors;

public class Lab1B_6 {
    public static void main(String[] args) {
//        Integer[] arr = new Integer[]{1, 3, 9, 4, 8, 5};
        Integer[] arr = new Integer[]{1, 2, 3};
        System.out.println(powerSet(Arrays.stream(arr).collect(Collectors.toList())));
    }

    public static List<Set> powerSet(List list) {
        ArrayList<Set> result = new ArrayList<>();
        result.add(new HashSet());
        for (int i = 0; i < list.size(); i++) {
            Object element = list.get(i);
            List<Set> newSubset = new ArrayList<>();
            for (int j = 0; j < result.size(); j++) {
                Set set = result.get(j);
                Set newSet = new HashSet(set);
                newSet.add(element);
                newSubset.add(newSet);
            }
            for (int j = 0; j < newSubset.size(); j++) {
                Set set = newSubset.get(j);
                result.add(set);
            }
        }

        return result;
    }
}
