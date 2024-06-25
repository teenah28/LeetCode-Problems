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
class Solution 
{
    class pair{
        int ht=-1;
        int dia=0;
    }
    public int diameterOfBinaryTree(TreeNode root) 
    {
       return sol(root).dia;
    }
    public pair sol(TreeNode root)
    {
        if(root==null)
        {
           return new pair(); 
        }
        pair left= sol(root.left);
        pair right=sol(root.right);
        int sd=left.ht+right.ht+2;
        pair p =new pair();
        p.ht=Math.max(left.ht,right.ht)+1;
        p.dia=Math.max(left.dia,Math.max(right.dia,sd));
        return p;
        }
        // int ld=sol(root.left);
        // int rd=sol(root.right);
        // int sd=height(root.left)+height(root.right)+2;
        // return Math.max(sd,Math.max(ld,rd));
    
    public int height(TreeNode root)
    {
        if(root==null)
        {
            return -1;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
}