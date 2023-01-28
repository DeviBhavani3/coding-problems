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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        zigzag(root, list);
        return list;
    }
    public void zigzag(TreeNode root, List<List<Integer>> list){
        if(root==null) 
          return;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(root);
        while(s1.isEmpty()==false || s2.isEmpty()==false){
            List<Integer> res1 = new ArrayList<Integer>();
            while(s1.isEmpty()==false){
                TreeNode curr = s1.pop();
                if(curr.left!=null) 
		            s2.push(curr.left);
                if(curr.right!=null)
		            s2.push(curr.right);
                res1.add(curr.val);
            }
            System.out.println("res1 " + res1);
            list.add(res1);
            if(!s1.isEmpty()==false && !s2.isEmpty()==false){
                break;
            }
            List<Integer> res2 = new ArrayList<Integer>();
            while(s2.isEmpty()==false)
            {
                TreeNode curr = s2.pop();
                if(curr.right!=null) 
			          s1.push(curr.right);
                if(curr.left!=null)  
                s1.push(curr.left);
                res2.add(curr.val);
            }
            System.out.println("res2  " + res2);
            list.add(res2);
        }
    }
}
