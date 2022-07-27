import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FIB {
    public static void main(String[] args) {
        fib1(10);
//        for(int i = 0; i < 10; ++i) {
//            System.out.println(fib1(i));
//        }
    }

    static int fib(int n) {
        if (n == 0 || n == 1) return n;
        int f0 = 0, f1 = 1, fn = 0;
        // 0 1 1 2 3 5 8 13
        for (int i = 2; i <= n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }

    static Map<Integer, Integer> map = new HashMap<>();
    static int fib1(int n) {
        if (n == 0 || n == 1) return n;
        Integer f0, f1;
        if (map.containsKey(n-1)) {
            f0 = map.get(n - 1);
        } else {
            f0 = fib1(n-1);
            map.put(n-1, f0);
        }
        if (map.containsKey(n-2)) {
            f1 = map.get(n - 2);
        } else {
            f1 = fib1(n-2);
            map.put(n-2, f1);
        }
        return f0 + f1;
    }
}
