package interview_question;

public class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        StringBuilder correct = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != indices[i]) {
                for (int j = 0; j < n; j++) {
                    if (i == indices[j]) {
                        correct.append(s.charAt(j));
                    }
                }
            } else {
                correct.append(s.charAt(i));
            }
        }
        return correct.toString();
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int abs = 0;
        for (int i = 1; i < n; i++) {
            int[] cur = points[i];
            int[] prev = points[i - 1];
            abs += Math.max(Math.abs(cur[0] - prev[0]), Math.abs(cur[1] - prev[1]));
        }
        return abs;
    }
}
