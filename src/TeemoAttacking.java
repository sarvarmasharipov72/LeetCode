public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int t = 0;
        for (int i = 0; i < timeSeries.length - 1; i++ ){
            Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        t += duration;
        return t;
    }
}
