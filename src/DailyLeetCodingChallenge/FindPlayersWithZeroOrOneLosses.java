package DailyLeetCodingChallenge;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> _matches = new HashMap<>();
        for (int[] match : matches) {
            _matches.put(match[1], _matches.getOrDefault(match[1], 0) + 1);
            _matches.put(match[0], _matches.getOrDefault(match[0], 0));
        }
        return result;
    }
}
