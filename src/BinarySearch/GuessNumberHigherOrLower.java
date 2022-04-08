package BinarySearch;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        if (n == 1) return 1;
        int low = 1;
        int height = n;
        int i;
        int mid;
        while(true) {
            mid = low + (height - low) / 2;
            i = guess(mid);
            if (i == 0) {
                return mid;
            } else if (i == -1) {
                height = mid - 1;
            } else {
                low = mid +1;
            }
        }
    }

    private int guess(int mid) {
        return 0;
    }
}
