class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i <= n; i+=2) {
                sum += i;
        }
        answer = sum;
        return answer;
    }
}