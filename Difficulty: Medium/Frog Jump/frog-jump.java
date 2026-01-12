class Solution {
    int minCost(int[] height) {
        // code here
        int[] dp = new int[height.length];
Arrays.fill(dp, -1);

        return helper(0,height,dp);
        
    }
    public int helper(int idx,int[] height,int[] dp){
        if(idx>=height.length-1)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int f=Math.abs(height[idx+1]-height[idx])+helper(idx+1,height,dp);
        int w=9999999;
        if(idx+2<height.length){
            w=Math.abs(height[idx+2]-height[idx])+helper(idx+2,height,dp);
        }
        dp[idx]=Math.min(f,w);
        return Math.min(f,w);
    }
}