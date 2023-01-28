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
    public List<Integer> rightSideView(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list =new ArrayList<Integer>();
        if(root==null)
        {
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
              TreeNode curr =queue.poll();
              if(i==0){
                  list.add(curr.val);
              }
              if(curr.right!=null){
                  queue.add(curr.right);
              }
              if(curr.left!=null){
                  queue.add(curr.left);
              }
            }
        }
        return list;

        
    }
}
