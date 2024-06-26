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
    int findmaxpathsum(TreeNode root,int[] maxi){
        if(root==null) return 0;
        int leftmax=Math.max(0, findmaxpathsum(root.left,maxi));
        int rightmax=Math.max(0,findmaxpathsum(root.right,maxi));

        maxi[0]= Math.max(maxi[0] , leftmax+rightmax+root.val);

        return Math.max(leftmax , rightmax) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        int[] maxi={Integer.MIN_VALUE};
        findmaxpathsum(root,maxi);
        return maxi[0];
    }
}