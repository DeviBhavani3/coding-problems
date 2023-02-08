class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);
        for(boolean val : visited)
            if(!val) 
              return false;
            return true;
    }
    public void dfs(int source, List<List<Integer>> rooms, boolean[] visited){
        visited[source] = true;
        for(Integer val: rooms.get(source)){
            if(!visited[val])
                dfs(val, rooms, visited);
        }

        
    }
}
