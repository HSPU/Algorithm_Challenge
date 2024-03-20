class Solution {
    public int solution(int n) {
        int cnt = 1;
        int start = 1;
        int end = 1;
        int sum = 1;
        
        while (end != n) {
            if (sum == n) {
                cnt++;
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else if (sum < n) {
                end++;
                sum += end;
            }
        }
        return cnt;
    }
}