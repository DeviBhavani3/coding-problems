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
    ArrayList<Integer> list =  new ArrayList<Integer>();
    public int getMinimumDifference(TreeNode root) {
        if(root==null){
            return 0;
        }
        inorder(root,list);
        int min = list.get(list.size()-1);
        for(int i=0;i< list.size()-1;i++){
            if(list.get(i+1)-list.get(i)< min){
                return list.get(i+1)-list.get(i);
            }
        }
        return min;

        
        
    }
    public void inorder(TreeNode root,ArrayList<Integer>list){
        if(root==null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

}
