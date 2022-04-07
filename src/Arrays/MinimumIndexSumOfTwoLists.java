package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = i + map.get(list2[i]);
                if (minIndex > sum) {
                    res.clear();
                    res.add(list2[i]);
                    minIndex = sum;
                } else if (minIndex == sum) {
                    res.add(list2[i]);
                }
            }
        }

        return res.toArray(new String[res.size()]);
    }
}
//List<String> list = new ArrayList<>();
//        for (String name1 : list1) {
//            for (String name2 : list2) {
//                if (name1 == name2) {
//                    list.add(name1);
//                }
//            }
//        }
//        String[] names = new String[list.size()];
//        {
//            int i = 0;
//            for (String name : list) {
//                names[i++] = name;
//            }
//        }
