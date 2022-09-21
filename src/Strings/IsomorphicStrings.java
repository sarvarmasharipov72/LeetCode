package Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s1 = new HashMap<>();
        Map<Character, Character> t1 = new HashMap<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char sLatter = s.charAt(i), tLatter = t.charAt(i);
            if (s1.containsKey(sLatter) && s1.get(sLatter) != tLatter || t1.containsKey(tLatter) && t1.get(tLatter) != sLatter) {
                return false;
            }
            s1.put(sLatter, tLatter);
            t1.put(tLatter, sLatter);
        }
        return true;
    }
//
//    public boolean isIsomorphic(String s, String t) {
//        int length = s.length();
//        Map<Character, Integer> s1 = new HashMap<>(), t1 = new HashMap<>();
//        for (int i = 0; i < length; i++) {
//            char sLatter = s.charAt(i), tLatter = t.charAt(i);
//            if (s1.containsKey(sLatter) || t1.containsKey(tLatter)) {
//                if (s1.getOrDefault(sLatter, -1) - t1.getOrDefault(tLatter, -1) == 0) {
//                    s1.put(sLatter, i);
//                    t1.put(tLatter, i);
//                } else {
//                    return false;
//                }
//                System.out.println("contains is true");
//            } else {
//                s1.put(sLatter, i);
//                t1.put(tLatter, i);
//                System.out.println("contains is false");
//            }
//        }
//        return true;
//    }
}
