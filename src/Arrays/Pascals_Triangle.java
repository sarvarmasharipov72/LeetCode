package Arrays;

import java.util.ArrayList;
import java.util.List;
public class Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List list2 = new ArrayList<Integer>();
        list2.add(1);
        list.add(list2);
        for (int i = 1; i < numRows; i++){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            for (int j = 1; j < i; j++){
                list1.add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
            }
            list1.add(1);
            list.add(list1);
        }
        return list;
    }
}
