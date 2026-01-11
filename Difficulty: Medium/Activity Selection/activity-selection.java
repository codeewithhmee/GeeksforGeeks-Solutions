class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int[][] pair=new int[start.length][2];
        for(int i=0;i<start.length;i++){
            pair[i]=new int[]{start[i],finish[i]};
        }
        Arrays.sort(pair, (a, b) -> a[1] - b[1]);
        int ans=1;
        int time=pair[0][1];
        for(int i=1;i<pair.length;i++){
            if(pair[i][0]>time){
                ans++;
                time=pair[i][1];
            }
        }
        return ans;
        
    }
}
