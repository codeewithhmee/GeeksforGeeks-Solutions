class Solution {
    boolean  isCycle=false;
    public boolean isCycle(int V, int[][] edges) {
        // Code here
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // building graph
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] vis = new boolean[V];
        
          for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                helper(adj, i, -1, vis);
            }
        }
       
        return isCycle;

    }
    public  void helper( ArrayList<ArrayList<Integer>> adj ,int current,int source,boolean[] vis){
        
        vis[current]=true;
        for(int n:adj.get(current)){
            if(vis[n]){
                if(source!=n) isCycle=true;
                continue;
            }
            helper(adj,n,current,vis);
        }
        
    }
       
}