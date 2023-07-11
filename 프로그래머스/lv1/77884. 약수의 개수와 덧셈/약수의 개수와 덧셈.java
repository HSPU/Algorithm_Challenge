class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            int divisor = 0;
            for (int j = 1; j <= right; j++) {
                if (i % j == 0) divisor++;
            }
            if (divisor % 2 == 0) sum += i;
            else sum -= i;
        }
        return sum;
    }
}