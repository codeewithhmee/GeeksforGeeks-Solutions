// User function template for java

class Solution {
    String arrayGame(int N, int A[]) {
        // code here
        int max=0;
        for(int n:A){
            max=Math.max(n,max);
        }
        int points=0;
        for(int n:A){
            points=points+(max-n);
        }
        if(points==0){
            return "Draw";
        }else if(points%2!=0){
            return "First";
        }else{
           return "Second";
        }
        
    }
}
