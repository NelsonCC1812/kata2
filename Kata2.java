package kata2;

import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        String[] data = { "Ana", "Benancio", "Casandra", "Diana", "Emily", "Benancio", "Casandra", "Casandra", "Diana",
                "Diana", "Diana", "Emily", "Emily", "Emily",
                "Emily" };

        HistogramGenerator<String> histogramGenerator = new HistogramGenerator<String>(data);
        Map<String, Integer> histogram = histogramGenerator.getHistogram();

        for (String key : histogram.keySet()) {
            System.out.println(String.format("key %s ==> %s", key, histogram.get(key)));
        }
    }
}