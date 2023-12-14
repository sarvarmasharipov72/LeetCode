package DailyLeetCodingChallenge;

public class DifferenceBetweenOnesAndZerosInRowAndColumn {
    public int[][] onesMinusZeros(int[][] grid) {
        int length = Math.max(grid.length, grid[0].length);
        int[] y = new int[grid.length], x = new int[grid[0].length];
        for (int i = 0; i < length; i++) {
            if (i < grid[0].length) {
                int sumX = 0;
                for (int[] ints : grid) {
                    sumX += (ints[i] == 0)? -1 : 1;
                }
                x[i] = sumX;
            }
            if (i < grid.length) {
                int sumY = 0;
                for (int ints : grid[i]) {
                    sumY += (ints == 0)? -1 : 1;
                }
                y[i] = sumY;
            }
        }
        int[][] result = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                result[i][j] = x[j] + y[i];
            }
        }
        return result;
    }
}
