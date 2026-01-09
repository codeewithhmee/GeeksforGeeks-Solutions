class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int greatest=arr[arr.length-1];
      
        ArrayList<Integer> ans=new ArrayList<>();
          ans.add(greatest);
       for(int i=arr.length-2;i>=0;i--){
           if(arr[i]>=greatest){
               greatest=arr[i];
               ans.add(arr[i]);
           }
       }
      int l=0;
      int r=ans.size()-1;
      while(l<=r){
          int temp=ans.get(l);
          ans.set(l,ans.get(r));
          ans.set(r,temp);
          l++;
          r--;
      }
       return ans;
        
    }
}
