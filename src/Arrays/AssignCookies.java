package Arrays;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int g_pointer = 0;
        int s_pointer = 0;
        while (s_pointer < s.length && g_pointer < g.length) {
            if (s[s_pointer] >= g[g_pointer]) {
                g_pointer++;
                s_pointer++;
            } else {
                s_pointer++;
            }
        }
        return g_pointer;
    }
}
