package DailyLeetCodingChallenge;

import utils.TreeNode;

import java.util.ArrayList;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        sumTreeEnd(root1, list1);
        sumTreeEnd(root2, list2);
        return list1.equals(list2);
    }

    public void sumTreeEnd(TreeNode note, ArrayList<Integer> list) {
        if (note != null) {
            if (note.left == null && note.right == null) {
                list.add(note.val);
            }
            sumTreeEnd(note.left, list);
            sumTreeEnd(note.right, list);
        }
    }
}
