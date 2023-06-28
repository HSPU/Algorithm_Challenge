class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            if (n % 2 != 0) sum += i + 1;
            else sum += i * i;
        }
        return sum;
    }
}