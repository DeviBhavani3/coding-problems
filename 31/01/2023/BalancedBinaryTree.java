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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        else if(Math.abs(height(root.left)- height(root.right))>1)
        {
            return false;
        }
        else{
            return isBalanced(root.left) && isBalanced(root.right);
        }       
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l= height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
    
}
