import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        boolean leftToRight = true;

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();
                if (leftToRight) {
                    row.add(node.val);
                } else {
                    row.add(0, node.val); // Add node value at the beginning for rightToLeft direction
                }

                if (node.left != null) {
                    nodes.add(node.left);
                }
                if (node.right != null) {
                    nodes.add(node.right);
                }
            }

            result.add(row);
            leftToRight = !leftToRight; // Toggle the direction after processing each level
        }

        return result;
    }
}