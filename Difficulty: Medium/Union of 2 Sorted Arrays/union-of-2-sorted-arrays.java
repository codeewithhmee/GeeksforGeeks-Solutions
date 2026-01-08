class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        int p1=0;
        int p2=0;
        while(p1<a.length && p2<b.length){
            if(a[p1]<b[p2]){
                if(!set.contains(a[p1])){
                     ans.add(a[p1]);
                }
                set.add(a[p1]);
                    
                
               
                p1++;
            }else if(a[p1]>b[p2]){
                    if(!set.contains(b[p2])){
                     ans.add(b[p2]);
                }
                set.add(b[p2]);
                p2++;
            }else{
                 if(!set.contains(a[p1])){
                     ans.add(a[p1]);
                }
                set.add(a[p1]);
                p1++;
                p2++;
            }
        }
        while(p1<a.length){
            if(!set.contains(a[p1])){
                     ans.add(a[p1]);
                }
                set.add(a[p1]);
                p1++;
        }
          while(p2<b.length){
                  if(!set.contains(b[p2])){
                     ans.add(b[p2]);
                }
                set.add(b[p2]);
                p2++; 
        }
        return ans;
        
    }
}
