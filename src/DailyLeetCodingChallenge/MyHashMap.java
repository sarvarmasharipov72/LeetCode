package DailyLeetCodingChallenge;

import java.util.HashMap;

public class MyHashMap {
    private HashMap<Integer, Integer> map;
    public MyHashMap() {
        map = new HashMap();
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        return map.get(key);
    }

    public void remove(int key) {
        map.remove(key);
    }
}
