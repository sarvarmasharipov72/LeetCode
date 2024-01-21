package DailyLeetCodingChallenge;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeArrayEmpty {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int number : nums) {
            numbers.put(number, numbers.getOrDefault(number, 0) + 1);
        }
        int operations = 0;
        for (int i: numbers.values()) {
            if (i == 1) return -1;
            int count = i / 3;
            if (i - count * 3 > 0) count++;
            operations += count;
        }
        return operations;
    }
}
