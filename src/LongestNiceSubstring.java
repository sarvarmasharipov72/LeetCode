public class LongestNiceSubstring {
    public static String longestNiceSubstring(String s) {
        if (s.length() == 1) return "";
        int max = 0, index = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int cnt = 0;
            for (int j = i + 1; j < s.length(); j++) {
                var k = s.substring(i, i + 1);
                var l = s.substring(j, j + 1);
                if (!s.substring(i, i + 1).equalsIgnoreCase(s.substring(j, j + 1))) {
                    break;
                }
                cnt++;
            }
            if (cnt > max) {
                max = cnt;
                index = i;
            }
        }
        if (max == 1) return "";
        else return s.substring(index, index + max + 1);
    }

    public static void main(String[] args) {

//        System.out.println("123456789".substring(3, 5));
        System.out.println(longestNiceSubstring("abcd"));
    }
}
