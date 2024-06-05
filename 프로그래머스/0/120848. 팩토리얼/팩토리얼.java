class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < 11; i++) {
            if (recursive(i) <= n) answer = i;
        }
        return answer;
    }
    public int recursive(int i) {
        if (i <= 1) return 1;
        else return recursive(i - 1) * i;
    }
}