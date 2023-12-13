package DailyLeetCodingChallenge;

public class SpecialPositionsInABinaryMatrix {

    public static int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            int index = checkRow(i, mat[i]);
            if (index >= 0 && checkColumn(index, i, mat)) {
                count++;
            }
        }

        return count;
    }

    private static boolean checkColumn(int index, int j, int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (j != i && mat[i][index] == 1) {
                return false;
            }
        }
        return true;
    }

    private static int checkRow(int i, int[] ints) {
        int index = -1;
        for (int j = 0; j < ints.length; j++) {
            if (ints[j] == 1) {
                if (index >= 0){
                    return -1;
                } else {
                    index = j;
                }
            }
        }
        return index;
    }

    /*
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && checkSpecial(i, j, mat)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean checkSpecial(int x, int y, int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (i != x && mat[i][y] == 1) return false;
        }
        for (int i = 0; i < mat[x].length; i++) {
            if (i != y && mat[x][i] == 1) return false;
        }
        return true;
    }
     */
}