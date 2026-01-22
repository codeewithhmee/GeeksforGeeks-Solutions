// User function Template for Java

class Solution {
    static String captain(int N) {
     int p1=1,p2=1,p3=0,p4=1;
     for(int i=5;i<=N;i++){
         int p5=0;
         int step1=p4;
         int step2=p3;
         int step4=p1;
         if(step1==0 || step2==0 || step4==0){
             p5=1;
         }
         int temp1=p1,temp2=p2,temp3=p3,temp4=p4;
         p4=p5;
         p3=temp4;
         p2=temp3;
         p1=temp2;
     }
     if(N==3)return "JACK";
    return (p4==1)?"JELLY":"JACK";
    }
     
}