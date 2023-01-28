public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        Queue<TreeNode> queue =new LinkedList<>();
        if(root==null)
        {
            return sum;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.remove();
            if(curr.val>=low && curr.val<=high){
                sum=sum+curr.val;
            }
            if(curr.left!=null && curr.val>=low){
                queue.add(curr.left);
            }
            if(curr.right!=null && curr.val<=high){
                queue.add(curr.right);
            }
        }
        return sum;        
    }
}
