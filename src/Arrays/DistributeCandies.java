package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> list = new HashSet<>();
        for (int i : candyType) {
            list.add(i);
        }
        return Math.min(list.size(), candyType.length);
    }
}
//int n = candyType.length / 2 - 1;
//        Arrays.sort(candyType);
//        for (int i = 1; i < candyType.length; i++){
//            if (n == 0) {
//                break;
//            }
//            if (candyType[i] != candyType[i - 1]) {
//                n--;
//            }
//
//        }
//        return candyType.length / 2 - n;
