package DailyLeetCodingChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EarliestPossibleDayOfFullBloom {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = growTime.length;
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            index.add(i);
        }
        Collections.sort(index, Comparator.comparingInt(i -> -growTime[i]));
        int sum = 0;
        for (int i = 0, curTime = 0; i < n; i++) {
            int idx = index.get(i);
            int time = curTime + plantTime[idx] + growTime[idx];
            sum = Math.max(sum, time);
            curTime += plantTime[idx];
        }
        return sum;
    }
}
