package kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator<T> {

    private final T[] data;

    public HistogramGenerator(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return Arrays.copyOf(this.data, this.data.length);
    }

    public Map<T, Integer> getHistogram() {

        Map<T, Integer> histogram = new HashMap<T, Integer>();

        for (T elm : data) {

            histogram.put(elm, histogram.containsKey(elm) ? histogram.get(elm) + 1 : 1);

        }

        return histogram;
    }

}
