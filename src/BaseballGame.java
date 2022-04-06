import java.util.LinkedList;

public class BaseballGame {
    public int calPoints(String[] ops) {
        LinkedList<Integer> list = new LinkedList<>();
        int sum = 0;
        for (String i : ops) {
            if (i.equals("C")) {
                sum -= list.peekLast();
                list.removeLast();
            } else if (i.equals("+")) {
                list.add(list.peekLast() + list.get(list.size() - 2));
                sum += list.peekLast();
            } else if (i.equals("D")) {
                list.add(list.peekLast() * 2);
                sum += list.peekLast();
            } else {
                sum += Integer.parseInt(i);
                list.add(Integer.parseInt(i));
            }

        }
        return sum;
    }
}
