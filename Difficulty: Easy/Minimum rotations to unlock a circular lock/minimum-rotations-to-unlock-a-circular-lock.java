// User function Template for Java

class Solution {
    static int rotationCount(long R, long D) {
        int ans=0;
        // code here
        while(R!=0){
            long digitOfRandom=R%10;
            long digitOfDesired=D%10;
            R/=10;
            D/=10;
            int val=(int)Math.abs(digitOfRandom-digitOfDesired);
            ans+=Math.min(val,10-val);
            
            
        }
        return ans;
    }
}