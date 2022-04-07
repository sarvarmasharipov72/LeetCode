package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_Two {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i <= rowIndex; i++){
            List list1 = new ArrayList<>();
            list1.add(1);
            for (int j = 1; j < i; j++){
                list1.add(list.get(j-1) + list.get(j));
            }
            list1.add(1);
            list = list1;
        }
        return list;
    }
}
