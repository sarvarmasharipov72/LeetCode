package DailyLeetCodingChallenge;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        System.out.println(n);
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            rev |= (n & 1);
            n >>= 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
