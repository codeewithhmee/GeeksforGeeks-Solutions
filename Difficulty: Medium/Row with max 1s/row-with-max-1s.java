// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int row=-1;
        int countOfOne=0;
        
        for(int i=0;i<arr.length;i++){
            int l=0;
            int r=arr[0].length-1;
            int positionOfFirstOne=-1;
            while(l<=r){
                int m=l+(r-l)/2;
                if(arr[i][m]==1){
                    positionOfFirstOne=m;
                    r=m-1;
                }else{
                    l=m+1;
                }
            }
            int numberOfOne=(positionOfFirstOne==-1)?0:arr[0].length-positionOfFirstOne;
            
            if(numberOfOne>countOfOne){
                countOfOne=numberOfOne;
               row=i;
            }
            
        }
        return row;
    }
}