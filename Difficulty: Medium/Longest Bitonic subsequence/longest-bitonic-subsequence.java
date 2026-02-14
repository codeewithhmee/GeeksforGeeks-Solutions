class Solution {
    public static int longestBitonicSequence(int n, int[] nums) {
        // code here
                // code here
        int[] lis1 = new int[nums.length];
        int[] lis2 = new int[nums.length];
           for (int i = 0; i < nums.length; i++) {
            lis1[i] = 1;
            for (int j = 0; j < i; j++) {
                  if (nums[i] > nums[j]  && lis1[j] + 1 > lis1[i]) {
                    lis1[i] = lis1[j] + 1;
                }
            }
        }
           for (int i = nums.length-1; i >=0; i--) {
            lis2[i] = 1;
            for (int j = i+1; j <nums.length; j++) {
                  if (nums[i] > nums[j]  && lis2[j] + 1 > lis2[i]) {
                    lis2[i] = lis2[j] + 1;
                }
            }
        }
        // for(int i=0;i<lis1.length;i++){
        //     System.out.print(lis1[i]+" ");
        // }
        // System.out.println();
        //   for(int i=0;i<lis1.length;i++){
        //     System.out.print(lis2[i]+" ");
        // }
        // System.out.println();
        
        
        
         int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (lis1[i] > 1 && lis2[i] > 1) { 
                maxLen = Math.max(maxLen, lis1[i] + lis2[i] - 1);
            }
        }

        return maxLen;
    }
}
