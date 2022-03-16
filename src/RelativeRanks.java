import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> scoreCopy = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            scoreCopy.put(score[i], i);
        }
        Arrays.sort(score);
        String[] list = new String[score.length];
        for (int i = score.length - 1; i >= 0; i--) {
            if (score.length - 1 == i) {
                list[scoreCopy.get(score[i])] = "Gold Medal";
                continue;
            }
            if (score.length - 2 == i) {
                list[scoreCopy.get(score[i])] = "Silver Medal";
                continue;
            }
            if (score.length - 3 == i) {
                list[scoreCopy.get(score[i])] = "Bronze Medal";
                continue;
            }
            list[scoreCopy.get(score[i])] = "" + (score.length - i);
        }
        return list;
    }
}
//var scoreCopy = score.clone();
//        String[] list = new String[score.length];
//        Arrays.sort(scoreCopy);
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < scoreCopy.length; j++) {
//                if (score[i] == scoreCopy[j]) {
//                    switch (score.length - j) {
//                        case 1:
//                            list[i] = "Gold Medal";
//                            break;
//                        case 2:
//                            list[i] = "Silver Medal";
//                            break;
//                        case 3:
//                            list[i] = "Bronze Medal";
//                            break;
//                        default: list[i] = "" + (score.length - j);
//                        break;
//                    }
//                    break;
//                }
//            }
//        }
//        return list;
