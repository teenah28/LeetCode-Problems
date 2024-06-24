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
    ArrayList<Integer> list=new ArrayList<>();

    // public TreeNode find(TreeNode root,int key){
    //     if(root==null){
    //         return;
    //     }
    //     if(root.val==key){
    //         arr.add(root.val);
    //         return root;
    //     }
    //     else{
    //         if(root.left!=null){
    //             find(root.left);
    //         }
    //         else{
    //            arr.add(find(root.right));
    //         }
    //         S.O.P(arr);
            
    //     }

    // }
    void inorder(TreeNode root){
        if(root == null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;        
    }
}