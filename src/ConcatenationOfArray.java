public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int[] concat = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            concat[i] = nums[i];
            concat[i + nums.length] = nums[i];
        }
        return concat;
    }

    public static void main(String[] args) {
        int[] n = getConcatenation(new int[] {1,2,1});
        for (int m : n) {
            System.out.println(m);
        }
    }
}
