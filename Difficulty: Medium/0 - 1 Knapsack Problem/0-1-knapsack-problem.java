class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] dp=new int[val.length][1001];
        return helper(0,val,wt,W,dp);
        
    }
    public int helper(int idx,int[] val,int[] wt,int w,int[][] dp){
        if(idx>=wt.length || w<=0){
            return 0;
        }
        if(dp[idx][w]!=0)return dp[idx][w];
        int a=0;
        if(wt[idx]<=w){
             a=val[idx]+helper(idx+1,val,wt,w-wt[idx],dp);
        }
        
        int b=helper(idx+1,val,wt,w,dp);
        dp[idx][w]= Math.max(a,b);
        return Math.max(a,b);
    }
}
