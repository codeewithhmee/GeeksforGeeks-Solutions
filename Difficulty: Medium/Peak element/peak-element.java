class Solution {
    public int peakElement(int[] arr) {
        // code here
        if(arr.length==1)return 0;
        for(int i=0;i<arr.length;i++){
           if(i==0 && arr[i+1]<arr[i])return 0;
           if(i==arr.length-1 && arr[i-1]<arr[i])return i;
           if(i-1>=0 && i+1<arr.length && arr[i]>arr[i-1] && arr[i+1]<arr[i])return i;
        }
        return 0;
        
        
        
        
    }
}