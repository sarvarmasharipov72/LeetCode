package Arrays;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {

        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        int t = Integer.MIN_VALUE;

        for (int i : nums) {
            f = Math.max(i, f);
        }
        for (int i : nums) {
            if (f == i)
                continue;
            s = Math.max(i, s);
        }
        var thirdFlase = false;
        for (int i : nums) {
            if (f == i || s == i)
                continue;
            t = Math.max(t, i);
            thirdFlase = true;
        }
        return thirdFlase ? t : f;
//        gave an error in numbers with a minus sign
//        var hashSet = new HashSet<Integer>();
//        for (int n : nums) {
//            hashSet.add(n);
//        }
//        if (hashSet.size() == 1) {
//            return (Integer) hashSet.toArray()[0];
//        }
//        if (hashSet.size() == 2) {
//            return (Integer) hashSet.toArray()[1];
//        }
//        int[] num = new int[hashSet.size()];
//        int i = 0;
//        for (int n : hashSet) {
//            num[i++] = n;
//        }
//        return num[num.length - 3];
    }
}
