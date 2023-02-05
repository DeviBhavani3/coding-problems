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
    ArrayList<Integer> list = new ArrayList<Integer>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root,list);
        return BST(list,0,list.size()-1);
        
    }
    public TreeNode BST(ArrayList<Integer>list,int start,int end){
        if(start>end){
          return null;
        }
        int mid=(start+end+1)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = BST(list,start, mid-1);
        root.right=BST(list, mid+1,end);
        return root;
    }
    public void inorder(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    

}
