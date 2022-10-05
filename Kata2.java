package kata2;

import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        Integer[] data = { 1, 2, 3, 4, 5, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5 };

        HistogramGenerator<Integer> histogramGenerator = new HistogramGenerator<Integer>(data);
        Map<Integer, Integer> histogram = histogramGenerator.getHistogram();

        for (Integer key : histogram.keySet()) {
            System.out.println(String.format("key %d ==> %d", key, histogram.get(key)));
        }
    }
}