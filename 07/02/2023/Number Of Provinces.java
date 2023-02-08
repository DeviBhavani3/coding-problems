class Solution {
        public int findCircleNum(int[][] isConnected) { 
        List<List<Integer>> adj = new ArrayList<>();
        int v= isConnected.length;
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
               if(isConnected[i][j]==1 && i!=j){
                   adj.get(i).add(j);
                   adj.get(j).add(i);
               }
            }
        }
        int [] visited = new int[v];
        int count=0;
        for(int i=0;i<v;i++)
        {
            if(visited[i]==0)
            {
               count++;
               dfs(i,adj,visited);
            }
        }
        return count;       
    
    }
    public void dfs(int i, List<List<Integer>> adj,int[] visited){
        visited[i]=1;
        for(int source :adj.get(i)){
            if(visited[source]==0)
            {
              dfs(source,adj, visited);

            }
        }
    }
}
