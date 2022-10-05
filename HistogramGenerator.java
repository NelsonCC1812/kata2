package kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator {

    private final Integer[] data;

    public HistogramGenerator(Integer[] data) {
        this.data = data;
    }

    public Integer[] getData() {
        return Arrays.copyOf(this.data, this.data.length);
    }

    public Map<Integer, Integer> getHistogram() {

        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        for (Integer elm : data) {

            histogram.put(elm, histogram.containsKey(elm) ? histogram.get(elm) + 1 : 1);

        }

        return histogram;
    }

}
