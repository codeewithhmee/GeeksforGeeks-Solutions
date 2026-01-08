// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int t=sum-k;
            if(map.containsKey(t)){
                ans=Math.max(ans,i-map.get(t));
            }
            if(!map.containsKey(sum))map.put(sum,i);
        }
        return ans;
    }
}
