class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        int p1=0;
        int p2=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]==arr2[p2]){
                int val=arr1[p1];
                ans.add(arr1[p1]);
                while(p1<arr1.length && arr1[p1]==val)p1++;
                while(p2<arr2.length && arr2[p2]==val)p2++;
                
            }else if(arr1[p1] <arr2[p2]){
                p1++;
            }else{
                p2++;
            }
        }
        return ans;
    }
}
