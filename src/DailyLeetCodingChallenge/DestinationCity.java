package DailyLeetCodingChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        Set<String> in = new HashSet<>(), out = new HashSet<>();
        for (List<String> cities : paths) {
            in.add(cities.get(0));
            out.add(cities.get(0));
        }
        for (String i: out) {
            if (!in.contains(i)) return i;
        }
        return "";
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        var list1 = new ArrayList<String>();
        list1.add("B");
        list1.add("C");
        var list2 = new ArrayList<String>();
        list1.add("D");
        list1.add("B");
        var list3 = new ArrayList<String>();
        list1.add("C");
        list1.add("A");
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(destCity(list));
    }
}
