class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int ans=-9999999;
        int sum=-9999999;
        for(int n:arr){
            sum+=n;
            if(sum<n){
                sum=n;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
