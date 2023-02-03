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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode parent=null;
        TreeNode curr=root;
        while(curr!=null){          
            if(curr.val==key){
                break;              
            }
            parent=curr;
            if(curr.val>key){
                curr=curr.left;
            }
            else{
                curr=curr.right; 
            }        
        }
        if(curr==null){
            return root;
        }
        if(parent==null){
            return del(curr);
        }
        if(parent.left==curr){
            parent.left=del(curr);
        }
        if(parent.right==curr){
            parent.right=del(curr);
        }
        return root;
    }
        public TreeNode del(TreeNode curr)
        {
            if(curr.left==null && curr.right==null){
                return null;

            }
            if(curr.left==null){
                return curr.right;
            }
            if(curr.right==null){
                return curr.left;
            }
            TreeNode temp=curr.right;
            TreeNode parent=curr;
            while(temp.left!=null)
            {
                parent=temp;
                temp=temp.left;
            }
            curr.val=temp.val;
            if(parent.left==temp){
                parent.left=temp.right;
            }
            else{
                parent.right=temp.right;
            }
            return curr;

        }

                    
    
}
