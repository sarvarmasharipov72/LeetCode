package Strings;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle))
            return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String p = haystack.substring(i, i + needle.length());
            if (p.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
