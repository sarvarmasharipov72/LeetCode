package DailyLeetCodingChallenge;

import java.util.LinkedList;
import java.util.Random;

public class RandomizedSet {

    private LinkedList<Integer> list;
    public RandomizedSet() {
        list = new LinkedList<>();
    }

    public boolean insert(int val) {
        if (!list.contains(val)) {
            list.add(val);
        return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (list.contains(val)) {
            list.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int i = new Random().nextInt(0, list.size());
        return list.get(i);
    }
}
