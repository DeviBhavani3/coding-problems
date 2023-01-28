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
class MaximumPathSum {
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        pathsum(root);
        return maxSum;
    }

    int maxSum;
    public int pathsum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = Math.max(pathsum(root.left), 0);
        int r = Math.max(pathsum(root.right), 0);
        maxSum = Math.max(maxSum, l + r + root.val);
        return Math.max(l,r)+root.val;
    }
}      
