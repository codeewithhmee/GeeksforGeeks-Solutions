class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] dp=new int[val.length][1001];
        //base case
        for(int i=0;i<val.length;i++){
            dp[i][0]=0;
        }
        //another base case
        for(int i=0;i<1001;i++){
            if(i>=wt[wt.length-1])dp[wt.length-1][i]=val[val.length-1];
        }
        //now we move upward
        for(int row=val.length-2;row>=0;row--){
            for(int remainingWt=1;remainingWt<1001;remainingWt++){
                int pick=(wt[row]<=remainingWt)?val[row]+dp[row+1][remainingWt-wt[row]]:;
                int notpick=dp[row+1][remainingWt];
                dp[row][remainingWt]=Math.max(pick,notpick);
            }
        }
        return dp[0][W];
        
    }
 
}
