class Solution {
    public double minMaxDist(int[] stations, int K) {
        // code here
        double unit=1e-6;
        double l=0;
        double r=0;
        for(int n:stations){
            r=Math.max(r,(double)n);
        }
        double ans=0;
        while(r-l>unit){
            double m=r+(l-r)/2;
            if(isValid(stations,K,m)){
                ans=m;
                r=m-unit;
            }else{
                l=m+unit;
            }
        }
        return ans;
        
    }
    public static boolean isValid(int[] stations,int k,double max){
        int total=0;
        for(int i=1;i<stations.length;i++){
            int diff=stations[i]-stations[i-1];
            if(diff%max==0){
                total+=diff/max-1;
            }else{
                 total+=diff/max;
            }
                
         
        }
        return total<=k;
    }
}
