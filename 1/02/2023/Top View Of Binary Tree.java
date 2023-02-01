/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
class Pair
{
            Node node;
            int val;
            public Pair(Node node, int val)
            {
                this.node = node;
                this.val = val;
            }
}
class Solution{
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans =new ArrayList<>();
        // add your code
        if (root == null)
        {
            return ans;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        Map<Integer, Node> map= new TreeMap<Integer, Node>();
        while (!q.isEmpty()) {
            Pair temp = q.poll();
            if (!map.containsKey(temp.val)) {
                map.put(temp.val, temp.node);
            }
 
            if (temp.node.left != null) {
                q.add(new Pair(temp.node.left,temp.val-1));
            }
            if (temp.node.right != null) {
                q.add(new Pair(temp.node.right,temp.val+1));
            }
        }
        for (Map.Entry<Integer, Node> entry :map.entrySet()) {
            ans.add(entry.getValue().data);
        }
        return ans;
    }
}
