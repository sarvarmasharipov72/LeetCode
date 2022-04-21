package Arrays;

import java.util.ArrayList;

public class MyHashSet {
    ArrayList<Integer> mySet;
    public MyHashSet() {
        mySet = new ArrayList<>();
    }

    public void add(int key) {
        if (!mySet.contains(key)) {
            mySet.add(key);
        }
    }

    public void remove(int key) {
        if (mySet.contains(key)) {
            mySet.remove((Integer) key);
        }
    }

    public boolean contains(int key) {
        return mySet.contains(key);
    }
}
