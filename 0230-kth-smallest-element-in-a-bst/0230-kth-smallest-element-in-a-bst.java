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
    void inorder(TreeNode node,int k,int[] result){
        if(node == null || result[1]>k){
            return ;
        }
        inorder(node.left,k,result);
        result[1]++;
        if(result[1]==k){
            result[0]=node.val;
            return ;
        }
        inorder(node.right,k,result);
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] result= new int[2]; //0th smallest value , 1: current count
        inorder(root,k,result);
        return result[0];

    }
}