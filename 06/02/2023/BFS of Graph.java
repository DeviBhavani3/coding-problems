class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        bfs.add(0);
        while(!queue.isEmpty()){
               int node  = queue.poll();
                for(Integer neigh :adj.get(node))
                {
                    if(!visited[neigh])
                    {
                        visited[neigh]=true;
                        bfs.add(neigh);
                        queue.offer(neigh);
                    }
                }
            
        }
        return bfs;
    }
}
