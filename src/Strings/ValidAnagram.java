package Strings;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] sch = s.toCharArray(), tch = t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);

        return new String(sch).equals(new String(tch));
    }
}
