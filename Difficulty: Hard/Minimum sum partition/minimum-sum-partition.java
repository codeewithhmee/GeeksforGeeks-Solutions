class Solution {
    int total;
    int ans = Integer.MAX_VALUE;
    boolean[][] seen;

    public int minDifference(int[] arr) {
        int n = arr.length;
        total = 0;
        for (int x : arr) total += x;

        seen = new boolean[n + 1][total + 1];
        dfs(arr, 0, 0);
        return ans;
    }

    public void dfs(int[] arr, int idx, int sum) {
        if (seen[idx][sum]) return;
        seen[idx][sum] = true;

        if (idx == arr.length) {
            ans = Math.min(ans, Math.abs(total - 2 * sum));
            return;
        }

        dfs(arr, idx + 1, sum + arr[idx]); // pick
        dfs(arr, idx + 1, sum);            // not pick
    }
}
