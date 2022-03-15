import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        ArrayList<String> note = new ArrayList<>();
        HashMap<Character, Integer> rowId = new HashMap<>();
        String q = "qwertyuiopQWERTYUIOP";
        for (char i : q.toCharArray())
            rowId.put(i, 1);
        q = "asdfghjklASDFGHJKL";
        for (char i : q.toCharArray())
            rowId.put(i, 2);
        q = "zxcvbnmZXCVBNM";
        for (char i : q.toCharArray())
            rowId.put(i, 3);
        for (String word : words) {
            boolean same_row = true;
            for (int i = 1; i < word.length(); i++) {
                if (!Objects.equals(rowId.get(word.charAt(i)), rowId.get(word.charAt(0)))) {
                    same_row = false;
                    break;
                }
            }
            if (same_row) {
                note.add(word);
            }
        }
        String[] list = new String[note.size()];
        {
            int k = 0;
            for (String i : note) {
                list[k++] = i;
            }
        }
        return list;
    }
}
