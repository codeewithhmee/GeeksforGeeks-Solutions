class Solution {
    public int findMin(int n) {
        int coin=0;
        // code here
        while(n>0){
         if(n>=10){
             coin+=n/10;
             n=n%10;
         }else if(n>=5){
             coin+=n/5;
             n=n%5;
         }else if(n>=2){
              coin+=n/2;
             n=n%2;
         }else{
             coin+=1;
             n=0;
         }
        }
        return coin;
    }
}
