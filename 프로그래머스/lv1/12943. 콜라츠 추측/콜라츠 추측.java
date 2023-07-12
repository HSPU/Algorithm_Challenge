class Solution {
    public int solution(long num) {
        int cnt = 0;
        while (num != 1) {
            cnt++;
            if (num % 2 == 0) num /= 2;
            else if (num % 2 != 0) num = num * 3 + 1;
            else if (num == 1) cnt = 0;
        }
        if (cnt >= 500) cnt = -1;
        return cnt;
    }
}