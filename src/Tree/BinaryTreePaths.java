package Tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        treePaths(root, "", paths);
        return paths;
    }
    public void treePaths(TreeNode root, String currentString, List<String> path) {
        if (root == null) return;
        currentString += root.val;
        if (root.left == null && root.right == null) {
            path.add(currentString);
            return;
        }
        treePaths(root.left, currentString + "->", path);
        treePaths(root.right, currentString + "->", path);
    }
}
