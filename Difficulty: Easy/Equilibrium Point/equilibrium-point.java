class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum=0;
        for(int n:arr)sum+=n;
        int sum1=0;
        int i=0;
        for(int n:arr){
            sum1+=n;
            int pre=sum1-n;
            int suff=sum-sum1;
            if(pre==suff)return i;
            i++;
        }
        return -1;
    }
}
