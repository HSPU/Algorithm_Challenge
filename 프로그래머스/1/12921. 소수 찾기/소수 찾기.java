class Solution {
    public int solution(int n) {
        int cnt = 0;
        boolean[] check = new boolean[n + 1];
        
        for (int i = 2; i <= n; i++) {
            if (check[i] == false) cnt++;
            for (int j = i * 2; j <= n; j += i) check[j] = true;
        }
        
        return cnt;
    }
}