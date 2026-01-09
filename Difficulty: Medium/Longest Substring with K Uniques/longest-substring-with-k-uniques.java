class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int ans=-1;
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()>k){
                 map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                 if(map.get(s.charAt(l))==0)map.remove(s.charAt(l));
                 l++;
            }
            //it is valid window
            if(map.size()==k){
                ans=Math.max(ans,r-l+1);
            }
            
        }
        return ans;
    }
}