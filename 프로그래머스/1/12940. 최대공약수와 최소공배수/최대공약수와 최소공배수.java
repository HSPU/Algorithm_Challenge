class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대공약수
        // if (m % n == 0 || n % m == 0) answer[0] = n;
        // else answer[0] = m % n;
        int gcd = 1;
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) gcd = i;
        }
        answer[0] = gcd;
        
        // 최소공배수
        answer[1] = m * n / answer[0];
        return answer;
    }
}