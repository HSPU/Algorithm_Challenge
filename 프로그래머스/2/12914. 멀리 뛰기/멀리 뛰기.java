class Solution {
    public long solution(int n) {
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < 2001; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}