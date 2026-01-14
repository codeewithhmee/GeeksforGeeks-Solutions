// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int[][] dp=new int[arr.length][3];
        for(int i=0;i<3;i++){
            dp[dp.length-1][i]=arr[arr.length-1][i];
        }
        for(int i=dp.length-2;i>=0;i--){
            for(int j=0;j<3;j++){
                int point=0;
                for(int k=0;k<3;k++){
                    if(j==k)continue;
                    point=Math.max(point,dp[i+1][k]);
                }
                dp[i][j]=point+arr[i][j];
            }
        }
        return Math.max(Math.max(dp[0][0],dp[0][1]),dp[0][2]);
        
    }

}