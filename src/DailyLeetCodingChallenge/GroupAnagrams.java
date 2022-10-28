package DailyLeetCodingChallenge;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if (map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                var l = new ArrayList<String>();
                l.add(str);
                map.put(s, l);
            }
        }
        return new ArrayList<>(map.values());
    }
}
