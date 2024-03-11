class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대공약수
        int gcd = 0;
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) gcd = i;
        }
        answer[0] = gcd;
        
        // 최소공배수
        answer[1] = m * n / gcd;
        return answer;
    }
}