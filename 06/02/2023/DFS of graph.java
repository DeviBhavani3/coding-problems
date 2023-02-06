class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited [] = new boolean[V];
        ArrayList<Integer>list = new ArrayList<Integer>();
        dfs(0, visited, adj , list);
        return list;
    }
    public ArrayList<Integer>dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>>adj, ArrayList<Integer>list){
        visited[node]=true;
        list.add(node);
        for(Integer n : adj.get(node)){
            if(!visited[n]){
                dfs(n, visited, adj, list);
            }
        }
        return list;
        
    }
}
