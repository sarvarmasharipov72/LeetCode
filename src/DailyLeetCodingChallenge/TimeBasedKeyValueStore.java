package DailyLeetCodingChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class TimeMap {
    private Map<String, TreeMap<Integer, String>> timeMap;

    public TimeMap() {
        timeMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!timeMap.containsKey(key)) {
            timeMap.put(key, new TreeMap<>());
        }
        timeMap.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!timeMap.containsKey(key)) return "";

        Integer floorKey = timeMap.get(key).floorKey(timestamp);
        if (floorKey != null) {
            return timeMap.get(key).get(floorKey);
        }
        return "";
    }
}
