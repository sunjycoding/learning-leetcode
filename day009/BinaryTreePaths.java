package day009;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 *
 * @author created by sunjy on 11/6/24
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", result);
        }
        return result;
    }

    private void findPaths(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }
        path += Integer.toString(node.val);
        if (node.left == null && node.right == null) {
            result.add(path);
        } else {
            path += "->";
            findPaths(node.left, path, result);
            findPaths(node.right, path, result);
        }
    }

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
