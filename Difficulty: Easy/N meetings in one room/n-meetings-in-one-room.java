class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int[][] pair=new int[start.length][2];
        for(int i=0;i<start.length;i++){
            pair[i]=new int[]{start[i],end[i]};
        }
        
        Arrays.sort(pair,(a,b)->a[1]-b[1]);
        int ans=1;
        int ending=pair[0][1];
        for(int i=1;i<pair.length;i++){
            if(pair[i][0]>ending){
                ending=pair[i][1];
                ans++;
            }
        }
        return ans;
        
    }
}
