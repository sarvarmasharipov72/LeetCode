package Strings;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        boolean bool = true;
        String prefix = "";
        String s;
        for (int i = 1; i < strs[0].length(); i++) {
            s = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() >= i && strs[j].startsWith(s)) {
                    continue;
                }
                bool = false;
                break;
            }
            if (!bool) {
                break;
            }
            prefix = s;
        }
        return prefix;
    }
}
