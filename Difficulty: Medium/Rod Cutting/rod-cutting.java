class Solution {
    public int cutRod(int[] price) {
        // code here
        int[][] dp=new int[price.length+1][price.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(price,price.length,1,dp);
        
        
        
    }
    public int helper(int[] price,int target,int length,int[][] dp){
        if(length>price.length)return 0;
        if(dp[length][target]!=-1)return dp[length][target];
        int pick=0;
        if(length<=target){
            pick=price[length-1]+helper(price,target-length,length,dp);
        }
        int notpick=helper(price,target,length+1,dp);
        dp[length][target]=Math.max(pick,notpick);
        return Math.max(pick,notpick);
        
    }
}