public class Range_Addition_Two {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) {
            return m*n;
        }
        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;
        for(int[] colum : ops) {
            minRow = Math.min(minRow, colum[0]);
            minCol = Math.min(minCol, colum[1]);
        }
        return minCol*minRow;
    }
}
