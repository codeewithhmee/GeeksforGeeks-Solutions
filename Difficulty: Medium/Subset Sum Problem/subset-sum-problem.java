class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int[][] dp=new int[arr.length][sum+1];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(arr,sum,0,dp);
        
        
    }
    public static boolean helper(int arr[],int target,int idx,int[][] dp){
        if(idx>=arr.length || target==0){
            if(target==0)return true;
            return false;
        }
        if(dp[idx][target]!=-1){
            if(dp[idx][target]==1)return true;
            return false;
        }
        boolean pick=false;
        if(arr[idx]<=target){
             pick=helper(arr,target-arr[idx],idx+1,dp);
        }
     
        boolean notpick=helper(arr,target,idx+1,dp);
        if(pick || notpick){
           dp[idx][target]=1; 
        }else{
             dp[idx][target]=0;  
        }
        return pick || notpick ;
        
    }
}