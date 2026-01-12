class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        int ans=0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int ending=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<ending){
                ans++;
                ending=Math.min(ending,intervals[i][1]);
            }else{
                ending=intervals[i][1];
            }
        }
        return ans;
    }
}
