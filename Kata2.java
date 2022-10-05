package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        Integer[] data = { 1, 2, 3, 4, 5, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5 };

        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        for (Integer elm : data) {

            if (histogram.containsKey(elm)) {
                histogram.put(elm, histogram.get(elm) + 1);
            } else {
                histogram.put(elm, 1);
            }
        }

        for (Integer key : histogram.keySet()) {
            System.out.println(String.format("key %d ==> %d", key, histogram.get(key)));
        }
    }
}