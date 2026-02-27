class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int[][] dp=new int[nums.length][target+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(nums,0,target,dp);
    }
    public int helper(int[] nums,int idx,int target,int[][] dp){
        if(idx==nums.length){
            if(target==0)return 1;
            return 0;
        }
        if(dp[idx][target]!=-1)return dp[idx][target];
        int pick=0;
        if(target>=nums[idx]){
            pick=helper(nums,idx+1,target-nums[idx],dp);
        }
        int notpick=helper(nums,idx+1,target,dp);
        return dp[idx][target]= pick+notpick;
    }
}