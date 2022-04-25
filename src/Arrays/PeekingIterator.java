package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {
    private final ArrayList<Integer> list;

    {
        list = new ArrayList<>();
    }

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }

    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return list.get(0);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    public Integer next() {
        int i = list.get(0);
        list.remove(0);
        return i;
    }

    public boolean hasNext() {
        return list.size() != 0;
    }
}
