class Solution {
    static Boolean isSubsetSum(int arr[], int sum) {
        boolean[][] dp=new boolean[arr.length][sum];
    return helper(arr,sum,0,dp);
    }
    public static boolean helper(int[] arr,int target,int idx, boolean[][] dp){
        if(target==0)return true;
        if(idx>=arr.length)return false;
        
        if(dp[idx][target-1])return false;
       
        boolean notpick=helper(arr,target,idx+1,dp);
        boolean pick=false;
        if(arr[idx]<=target){
            pick=helper(arr,target-arr[idx],idx+1,dp);
        }
         dp[idx][target-1]=true;
     
        return pick || notpick;
    }
}
