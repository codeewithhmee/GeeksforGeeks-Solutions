// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int ans=0;
        int num=n;
        while(n!=0){
            if(n%10!=0 && num%(n%10)==0)ans++;
            n/=10;
        }
        return ans;
    }
}