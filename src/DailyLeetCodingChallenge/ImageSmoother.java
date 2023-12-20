package DailyLeetCodingChallenge;

public class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length; j++) {
                result[i][j] = getAvg(
                        img,
                        (j > 0) ? j - 1 : j,
                        (j < (img[0].length - 1))? (j + 1) : j,
                        (i > 0)? (i - 1) : i,
                        (i < (img.length - 1))? (i + 1) : i
                );
            }
        }
        return result;
    }
    public int getAvg(int[][] nums, int startX, int endX, int startY, int endY) {
        int sum = 0, count = 0;
        for (int i = startY; i <= endY; i++) {
            for (int j = startX; j <= endX; j++) {
                sum += nums[i][j];
                count++;
            }
        }
        return sum / count;
    }
}
