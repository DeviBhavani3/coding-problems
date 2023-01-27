class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        if(root==null)
        {
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size= queue.size();
            List<Integer> sublist = new LinkedList<>();
            for(int i=1;i<=size;i++){
                TreeNode curr = queue.poll();
                sublist.add(curr.val);
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            
            }
            list.add(sublist);
            
        }
        return list;
        
        
        
    }
}
